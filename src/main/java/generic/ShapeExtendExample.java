package generic;

public class ShapeExtendExample {
    public static void main(String[] args) {
        var continaer = new ShapeContainer();
        continaer.add(new Circle(3.0));
        continaer.add(new Circle(5.0));

        System.out.println("총 넓이: " + continaer.totalArea());
    }
}
