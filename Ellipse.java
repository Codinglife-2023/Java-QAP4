package QAP4.Problem1;

// Ellipse class inheriting from Shape, representing an ellipse
public class Ellipse extends Shape {
    private double a, b; // Major (a) and minor (b) axes

    // Constructor to set the name and axes, ensuring a >= b
    public Ellipse(String name, double a, double b) {
        super(name);
        if (a >= b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    }

    // Calculate the area of the ellipse
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    // Calculate the perimeter of the ellipse (approximation)
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}