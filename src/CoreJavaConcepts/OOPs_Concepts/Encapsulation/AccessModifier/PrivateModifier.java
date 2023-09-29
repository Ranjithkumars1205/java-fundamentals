package CoreJavaConcepts.OOPs_Concepts.Encapsulation.AccessModifier;

/**
 * If you make any class constructor private, you cannot create the instance of
 * that class from outside the class
 */
public final class PrivateModifier {

    PrivateModifier() {

    }

    void msg() {
        System.out.println("Hello java");
    }

    public static void main(String[] args) {
        PrivateModifier obj = new PrivateModifier();
        obj.msg();
    }

}
