package Inheritance_Question;

public interface Shape {
    double getArea();
    double getPerimeter();
    String toString();

}
class Rectangle implements Shape{
    double length;
    double width;
    Rectangle(double new_length, double new_width){
        this.length = new_length;
        this.width = new_width;
    }

    @Override
    public double getArea() {
        System.out.print("Rectangle area: ");
        return length*width;
    }

    @Override
    public double getPerimeter() {
        System.out.print("Rectangle perimeter: ");
        return 2*(length+width);
    }
}

class Square extends Rectangle {
    float side;
    Square(float side){
        super(side,side);
        this.side = side;
    }

    @Override
    public double getArea() {
        System.out.print("Square area: ");
        return side*side;
    }

    @Override
    public double getPerimeter() {
        System.out.print("Square perimeter: ");
        return 4*side;
    }
}
class Circle implements Shape{
    double radius;

    Circle(double radius){
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}



