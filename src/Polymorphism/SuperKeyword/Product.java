package Polymorphism.SuperKeyword;

public class Product extends AmazonPlatform {
    private int id;
    private String productName;
    private int price;

    public Product(int id, String productName, int price) {
        super("Ranjith", 1); // invoke parent class constructor.
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    @Override
    void display() {
        // TODO Auto-generated method stub
        System.out.println(userName + " " + id + " " + productName + " " + price);
        super.display(); // invoke parent class method
    }

}
