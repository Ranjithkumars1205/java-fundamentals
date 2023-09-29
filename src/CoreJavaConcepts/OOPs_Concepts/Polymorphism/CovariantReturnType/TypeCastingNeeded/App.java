package CoreJavaConcepts.OOPs_Concepts.Polymorphism.CovariantReturnType.TypeCastingNeeded;

class Animal {
    Animal giveBirth() {
        System.out.println("This is Animal give birth");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Animal giveBirth() {
        return new Dog();
    }

    void bark() {
        System.out.println("Woof!");
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        /***
         * We create an instance of Dog and assign it to a reference of type Animal,
         * taking advantage of polymorphism.
         * We then call myAnimal.giveBirth(), but because the reference is of type
         * Animal, we need to explicitly cast the result to Dog.
         * This is where the potential issue arises.
         * If we didn't perform the type casting correctly (e.g., if we cast it to
         * another incompatible type),
         * we would encounter a ClassCastException at runtime, causing the program to
         * crash.
         */
        // Animal myAnimal = new Dog();
        // // Attempting to call the overridden method
        // Dog myDog = (Dog) myAnimal.giveBirth(); // Type casting
        // myDog.bark(); // This will work because myAnimal is actually a Dog

        Dog myDog = new Dog();
        // Dog newDog = myDog.giveBirth();
        Animal myAnimal = myDog.giveBirth(); // giveBirth return type as Animal as we have to use Animal Type
        Dog newDog = (Dog) myAnimal; // Explicit casting required , here newDog is return value(instance);
        /**
         * In this example, when calling myAnimal.giveBirth(), you receive an Animal
         * reference, and to use it as a Dog, you need to perform
         * explicit casting.
         */
    }

    /**
     * Conclusion:
     * Covariant return types, as discussed in the previous response, help eliminate
     * the need for such explicit type casting. By allowing the
     * overridden method to return a more specific type, the correct type is
     * returned without the risk of runtime errors related to type casting.
     */

}
