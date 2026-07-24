class PiValue {
    public final double PI = 3.14159;   // Public
    private double radius;              // Private
    protected double area;              // Protected

    public void setRadius(double r) {
        radius = r;
    }

    public void calculateArea() {
        area = PI * radius * radius;
    }

    public void display() {
        System.out.println("Value of PI = " + PI);
        System.out.println("Radius = " + radius);
        System.out.println("Area of Circle = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        PiValue obj = new PiValue();

        obj.setRadius(5);
        obj.calculateArea();
        obj.display();
    }
}
