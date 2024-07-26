package QAP4.Problem2;
// Circle class implementing Scalable interface, representing a circle
public class Circle extends Ellipse {
    // Constructor to set the name and radius of the circle
    public Circle(String name, double radius) {
        super(name, radius, radius); // Both axes are equal in a circle
    }

    // Scale method already defined in Ellipse class
    @Override
    public void scale(double factor) {
        super.scale(factor);
    }
}
