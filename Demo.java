package QAP4.Problem1;

// Demo class for testing the shape hierarchy
public class Demo {
    public static void main(String[] args) {
        // Array of Shape objects, demonstrating polymorphism
        Shape[] shapes = new Shape[]{
            new Circle("Circle", 5),
            new Ellipse("Ellipse", 4, 2),
            new Triangle("Triangle", 3, 4, 5),
            new EquilateralTriangle("EquilateralTriangle", 3)
        };

        // Print details of each shape using the overridden toString method
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}