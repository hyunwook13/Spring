package generic;

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer<T extends Shape> {
        List<T> shapes = new ArrayList<>();


        public void add(T shape) {
            shapes.add(shape);
        }

    public List<T> getShapes() {
        return shapes;
    }

    public double totalArea() {
        return shapes.stream()
                .mapToDouble(Shape::getArea)
                .sum();
    }
}
