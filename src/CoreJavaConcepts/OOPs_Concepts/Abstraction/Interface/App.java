package CoreJavaConcepts.OOPs_Concepts.Abstraction.Interface;

public class App {
    public static void main(String[] args) {
        Parent p = new Parent("Padmavathy", 47, null);
        p.sayHello();
        p.saySomething();
        p.introduce();
        System.out.println(p);
        p.doDaily();
        p.sleep();
    }
}
