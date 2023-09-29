package CoreJavaConcepts.OOPs_Concepts.Polymorphism.SuperKeyword;

public class AmazonPlatform {
    String userName;
    int id;

    public AmazonPlatform(String userName, int id) {
        this.userName = userName;
        this.id = id;
    }

    void display() {
        System.out.println("This is super class");
    }

}
