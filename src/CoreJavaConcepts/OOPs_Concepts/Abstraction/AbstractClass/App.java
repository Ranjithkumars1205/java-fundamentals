package CoreJavaConcepts.OOPs_Concepts.Abstraction.AbstractClass;

public class App {
    public static void main(String[] args) {

        Parent h1 = new Parent("Padmavathy", 47, ""); // we are not make it as upcasting. because we should pass this
                                                      // instance to child constructor.
        Human h2 = new Child("Ranjith Kumar", 27, "Software Developer", h1); // this is upcasting

        if (h2 instanceof Child) {
            Child ranjith = (Child) h2; // downcasting
            h1.setChild(ranjith);
        }

        h1.sayHello();
        h1.saySomething();
        h1.introduce();
        System.out.println(h1); // Parent [role = Mother]
        h1.doDaily();
        h1.sleep();

        h2.sayHello();
        h2.saySomething();
        h2.introduce();
        System.out.println(h2);
        h2.doDaily();
        h2.sleep();

    }

}
