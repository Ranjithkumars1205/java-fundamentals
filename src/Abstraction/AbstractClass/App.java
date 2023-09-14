package Abstraction.AbstractClass;

public class App {
    public static void main(String[] args) {

        Parent h1 = new Parent("Padmavathy", 47, ""); // we are not make it as upcasting. because we should pass this
                                                      // instance to child constructor.
        Human h2 = new Child("Ranjith Kumar", 27, "Software Developer", h1); // this is upcasting

        h1.saySomething();
        h1.sayHello();
        h1.introduce();
        h1.toString();
        h1.eat();
        h1.sleep();

        h2.saySomething();
        h2.sayHello();
        h2.introduce();
        h2.toString();
        h2.sleep();

    }

}
