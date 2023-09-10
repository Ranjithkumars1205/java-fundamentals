package Inheritance.IS_A_relationship.inheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog() {
        /**
         * It's way to call a constructor on the super class, directly from the sub
         * class's constructor.
         * Like this(), it has to be the first statement of the constructor.
         * Because of that rule, this() and super() can never be called from the same
         * constructor
         * If your super class constructor doesn't have a default constructor, than you
         * must explicitly call super() in all
         * of your constructors, passing the right arguments to that constructor.
         */
        // this();
        // super("Mutt", "Big", 50); // without this line, compile it see the result
        // super();
        // TODO Auto-generated constructor stub
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + "] " + super.toString();
    }

    /**
     * Overriding a method is when you create a method on a subclass, which has the
     * same signature as a method on a super class.
     * You override a parent class method, when you want the child class to show
     * different behavior for that method
     */

    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Ow Wooooo! ");

        }
        bark();
        System.out.println();

    }

    /*
     * It can implement completely different behavior, overriding the behavior of
     * the parent.
     * It can simply call the parent class's method, which is somewhat redundant to
     * do
     * Or the method can call the parent class's methid, and include other code to
     * run, so it can extend the functionality
     * for the Dog, for that behavior.
     */
    @Override
    public void move(String speed) {
        // TODO Auto-generated method stub
        super.move(speed);
        // System.out.println("Dogs walk , run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.println("Woof! ");
    }

    private void run() {
        System.out.println("Dog Running ");
    }

    private void walk() {
        System.out.println("Dog Walking ");
    }

    private void wagTail() {
        System.out.println("Tail Wagging ");
    }
}
