package FileIO;

import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) {

//        var path = "/example.txt";

//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
//            bw.write("Hello World");
//            bw.newLine();
//            bw.write("Hello World");
//            bw.newLine();
//            bw.write("Hello World");
//            bw.newLine();
//            System.out.println("끝");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        var path = "./src/main/resources/example.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("Hello File I/O");
            bw.newLine(); // 줄바꿈
            bw.write("Using BufferedWriter for better performance");
            bw.newLine();
            System.out.println("긑");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            // readLine() 을 사용해 한 줄씩 읽기
            while ((line = br.readLine()) != null) { // 한 줄씩 읽다가 파일 끝이면 null 반환
                System.out.println(line); // 한 줄씩 출력
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // BufferedWriter로 텍스트 파일에 한 줄씩 쓰는 예시


    }

//        try (FileWriter fw = new FileWriter(path)) {
//            String content = "Hello File I/O";
//            for (char c : content.toCharArray()) {
//                fw.write(c); // 한 문자씩 디스크에 쓰기
//                // 매번 디스크 I/O 발생 -> 느림
//            }
//
//            fw.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (FileReader fr = new FileReader(path)) {
//            int data;
//
//            while ((data = fr.read()) != -1) {
//                System.out.println((char) data);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



}
