package Polymorphism.UpCasting_RuntimePolymorphism;

public class Rectangle extends Shape {
    public int width = 10;
    public int height = 10;

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

}
