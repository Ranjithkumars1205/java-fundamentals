package CoreJavaConcepts.OOPs_Concepts.CallByValueReference;

public class ByReference {
    String name;

    ByReference(String name) {
        this.name = name;
    }

    public static void modifyReference(ByReference p) {
        p.name = "Alice";
        System.out.println("Inside method: " + p.name);
    }

    public static void main(String[] args) {
        ByReference person = new ByReference("John");
        System.out.println("Before method call: " + person.name);
        modifyReference(person);
        System.out.println("After method call: " + person.name);
    }

}
