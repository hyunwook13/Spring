package generic;

import java.util.List;

public class WildCardProducerExample {
    static public void printAllShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

    }
}
