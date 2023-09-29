package CoreJavaConcepts.OOPs_Concepts.CallByValueReference;

public class ByValue {
    String name = "Logesh";
    int data = 50;

    /**
     * When you pass a primitive type (int, double, char, etc.) to a method, a copy
     * of the value is passed. Any modifications made to the parameter inside the
     * method will not affect the original variable outside the method.
     * 
     * @param newName
     * @param data
     */
    void change(String newName, int data) {
        // this.name = name;
        // name = newName; // Cannot make a static reference to the non-static field
        // data = data + 100; // here, argument value is modified not instance value
        this.data = data; // this is instance modification, it will reflect in
        // instance

    }

    public static void main(String[] args) {

        ByValue obj = new ByValue();

        ByValue obj2 = new ByValue();

        // System.out.println("Before change " + obj.name);
        System.out.println("Before change " + obj.data);

        obj.change("Ranjith", 500);
        System.out.println("After change " + obj.data);

        ByValue obj3 = new ByValue();

        System.out.println("After change " + obj2.data); // change not updated in this instance
        System.out.println("After change " + obj3.data); // change not updated in this instance

    }

}
