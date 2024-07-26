package QAP4.Problem2;

import QAP4.Problem1.Shape;

// Ellipse class implementing Scalable interface
public class Ellipse extends Shape implements Scalable {
    private double a, b; // Major and minor axes

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

    // Scale the ellipse's dimensions
    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
