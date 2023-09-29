package CoreJavaConcepts.OOPs_Concepts.StaticConcepts.static_method;

// When you need methods that perform operations related to a class but don't necessarily depent on instance data, 
// static methods can be helpfull.
public class App {
    public static void main(String[] args) throws Exception {
        Laptop dellLaptop = new Laptop("Dell", 50000.00);
        double discountedPercentage = 10.0;
        double discountedPrice = Laptop.applyDiscount(dellLaptop.price, discountedPercentage);

        System.out.println("Original price of " + dellLaptop.brand + " laptop: Rs." + dellLaptop.price);
        System.out.println("Discounted price after " + discountedPercentage + "% off: Rs" + discountedPrice);
    }

}
