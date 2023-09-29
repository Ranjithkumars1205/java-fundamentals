package CoreJavaConcepts.OOPs_Concepts.Polymorphism.InstanceOf_DownCasting;

public class App {
    public static void main(String args[]) {
        Printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }

}
