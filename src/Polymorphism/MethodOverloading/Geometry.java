package Polymorphism.MethodOverloading;

// Here, the calculateArea method is overloaded to calculate the area of a circle and a rectangle.

public class Geometry {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }
}
