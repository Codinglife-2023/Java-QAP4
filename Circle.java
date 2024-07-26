package QAP4.Problem1;

// Circle class inheriting from Ellipse, representing a circle
public class Circle extends Ellipse {
    // Constructor to set the name and radius of the circle
    public Circle(String name, double radius) {
        super(name, radius, radius); // Both axes are equal in a circle
    }
}