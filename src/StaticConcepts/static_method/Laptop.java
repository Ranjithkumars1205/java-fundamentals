package StaticConcepts.static_method;

public class Laptop {
    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // String getBrand() {
    // return this.brand;
    // }

    // it will usefull for perform calculation
    public static double applyDiscount(double originalPrice, double discountPercentage) {
        // A static method can access static data member and can change the value of it.
        // this.brand // error : Cannot use this in a static contextJava(536871112)
        return originalPrice * (1 - discountPercentage / 100);
    }

}
