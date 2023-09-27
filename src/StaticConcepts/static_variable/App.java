package StaticConcepts.static_variable;

public class App {
    public static void main(String[] args) throws Exception {
        Learning obj = new Learning(3, "Java");
        obj.printTarget();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("Number of instances created with static variable: " + Counter.count);
        System.out.println("Number of instances created without static variable: " + c3.instanceCount);
        System.out.println("Static Block variable count: " + Counter.staticBlockCount);
        // If it is incremented, it won't reflect other objects. So each object will
        // have the value 1 in the count variable.

    }
}
