package Polymorphism.UpCasting_RuntimePolymorphism;

public class Circle extends Shape {
    public int radius = 0;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Draw Circle");
    }
}
