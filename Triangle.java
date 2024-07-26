package QAP4.Problem1;

// Triangle class inheriting from Shape, representing a general triangle
public class Triangle extends Shape {
    private double side1, side2, side3; // Sides of the triangle

    // Constructor to set the name and sides of the triangle, checks for validity
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid sides for a triangle.");
        }
    }

    // Calculate the area of the triangle using Heron's formula
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Calculate the perimeter of the triangle
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}