package QAP4.Problem2;
// Demo class for testing the scaling of shapes
public class Demo {
    public static void main(String[] args) {
        // Array of Scalable objects, demonstrating polymorphism
        Scalable[] scalableShapes = new Scalable[]{
            new Circle("Circle", 5),
            new Ellipse("Ellipse", 4, 2),
            new Triangle("Triangle", 3, 4, 5),
            new EquilateralTriangle(3)};

        System.out.println("Before scaling:");
        // Print details of each shape before scaling
        for (Scalable shape : scalableShapes) {
            System.out.println(shape);
        }

        // Scale all shapes by a factor of 2
        scaleShapes(scalableShapes, 2.0);

        System.out.println("\nAfter scaling:");
        // Print details of each shape after scaling
        for (Scalable shape : scalableShapes) {
            System.out.println(shape);
        }
    }

    // Method to scale an array of Scalable shapes
    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
