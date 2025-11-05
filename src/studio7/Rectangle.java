package studio7;

public class Rectangle {

    // instance variables
    private double length;
    private double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // compute area
    public double area() {
        return length * width;
    }

    // compute perimeter
    public double perimeter() {
        return 2 * (length + width);
    }

    // check if it is a square
    public boolean isSquare() {
        return length == width;
    }

    // compare area with another rectangle
    public boolean isSmallerThan(Rectangle other) {
        return this.area() < other.area();
    }

    // toString method
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }

    // testing
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 5);

        System.out.println(r1);                
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Is square? " + r1.isSquare());

        System.out.println();
        System.out.println("Compare r1 smaller than r2: " + r1.isSmallerThan(r2));
    }
}