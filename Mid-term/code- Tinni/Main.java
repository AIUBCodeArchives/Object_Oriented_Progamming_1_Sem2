import java.lang.*;

abstract class Shape {
  final double pi = 3.1416;

  abstract double area();
}

class Circle extends Shape {
  private double radius;

  Circle(double radius) {
    System.out.println("Shape Constructor Calling");
    this.radius = radius;
  }

  double area() {
    System.out.println(pi * 2);
    return pi * radius * radius;
  }
};

class Rectangle extends Shape {
  private double length;
  private double width;

  Rectangle(double length, double width) {
    System.out.println("Rectangle Constructor Calling");
    this.length = length;
    this.width = width;
  }

  double area() {
    return length * width;
  }
};

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(4, 6);
    System.out.println(circle.area());
    System.out.println(rectangle.area());
  }
}