package Polymorphism.InstanceOf_DownCasting;

public class Call {

    void invoke(Printable p) {// upcasting
        if (p instanceof A) {
            A a = (A) p;// Downcasting
            a.a();
        }
        if (p instanceof B) {
            B b = (B) p;// Downcasting
            b.b();
        }

    }

}
