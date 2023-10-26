package CoreJavaConcepts.OOPs_Concepts.Polymorphism.FinalKeyword_Constant;

// import CoreJavaConcepts.OOPs_Concepts.Polymorphism.FinalKeyword_Constant.Math;

public class CommonApiController {

    public final String getStoreJSON() { // If you make any method as final, you cannot override it.
        return null;
    }

    public double calculateAreaOfCircle(double radius) {
        // Math m = new Math();
        return Math.PI * radius * radius;
    }
}
