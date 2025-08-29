package FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvToListProductExample {


    public static class Product {
        private int id;
        private String name;
        private int price;
        public Product(int id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static void main(String[] args) {
        var path = "./src/main/resources/products.csv";
        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            var flag = true;
            String line;
            while((line = br.readLine()) != null) {
                if (flag) {
                    flag = false;
                    continue;
                }

                String[] fields = line.split(",");

                int id = Integer.parseInt(fields[0]);
                int price = Integer.parseInt(fields[2]);

                Product product = new Product(id, fields[1], price);
                products.add(product);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage());
        }

        products.stream()
                .forEach(p -> System.out.println(p.toString()));

        Product[] newProducts = new Product[] {
                new Product(4,"Carrot",500),
                new Product(5,"Potato",200),
                new Product(6,"Pear",10000),
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("id,name,price");
            bw.newLine();

            products.addAll(List.of(newProducts));

            for(Product p : products) {
                bw.write(p.getId() + "," + p.getName() + "," + p.getPrice());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage() + e.getLocalizedMessage());
        }

    }
}
