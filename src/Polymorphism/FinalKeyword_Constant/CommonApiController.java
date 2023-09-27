package Polymorphism.FinalKeyword_Constant;

public class CommonApiController {

    public final String getStoreJSON() { // If you make any method as final, you cannot override it.
        return null;
    }

    public double calculateAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
}
