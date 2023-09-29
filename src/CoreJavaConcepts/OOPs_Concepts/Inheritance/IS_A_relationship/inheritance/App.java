package CoreJavaConcepts.OOPs_Concepts.Inheritance.IS_A_relationship.inheritance;

/**
 * Code Re-use:
 * All the subclasses can execute methods, even though the code is declared on
 * the parent class.
 * The code doesn't have to be duplicated in each subclasses.
 * We can use code, from the parent or we can change that code for the subclass
 */

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Gold Fish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal); // toString - don't need to call toString like animal.toString()
        System.out.println("_ _ _ _");
    }
}
