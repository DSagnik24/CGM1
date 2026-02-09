package Inheritance_Question;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2.0, 3.0);
        Shape square = new Square(2.0F);
        Shape circle = new Circle(2.0);

        System.out.println("Finding area and perimeter of shapes");

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}
