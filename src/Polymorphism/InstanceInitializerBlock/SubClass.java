package Polymorphism.InstanceInitializerBlock;

public class SubClass extends SuperClass {
    int instanceCount = 0;
    static int count = 0;
    static {
        // Static initializer block
        System.out.println("Static initializer block invoked");
    }

    { // It run once for each instance like ngOnInit but Executed just before the
      // constructor for that instance is invoked.
        instanceCount++;
        count++;
        System.out.println("Instance initializer block invoked");
    }

    SubClass() {
        // super();
        System.out.println("Child class constructor invoked" + instanceCount + count);
        System.out.println("InstanceCount - " + instanceCount + " " + "count - " + count);
    }

    SubClass(String title) {
        System.out.println("Child class constructor invoked");
        System.out.println("InstanceCount - " + instanceCount + " " + "count - " + count);
    }
}
