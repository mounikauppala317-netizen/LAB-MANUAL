import java.util.Scanner;

interface Shape {
    void area();
}

class Circle implements Shape {
    private double radius;

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Rectangle implements Shape {
    private double length, breadth;

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        r.area();
    }
}
