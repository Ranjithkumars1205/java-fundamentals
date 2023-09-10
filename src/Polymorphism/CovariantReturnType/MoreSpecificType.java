package Polymorphism.CovariantReturnType;

class Animal {
    Animal giveBirth() {
        // Base class returns an instance of itself
        System.out.println("Animal giveBirth");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog giveBirth() {
        // Derived class returns an instance of itself
        System.out.println("Dog giveBirth");
        return new Dog();
    }

    void bark() {
        System.out.println("Woof!");
    }
}

public class MoreSpecificType {

    public static void main(String[] args) throws Exception {
        // Animal myAnimal = new Dog(); // here Animal is reference type
        // myAnimal.giveBirth(); // Dog giveBirth
        // Dog dog = (Dog) myAnimal.giveBirth();
        // dog.bark();
        Dog myDog = new Dog();
        Dog newDog = myDog.giveBirth(); // No explicit casting required, here newDog is return value(instance);
        /**
         * In this case, because Dog is a subtype of Animal, and we are using covariant
         * return types, the myAnimal.giveBirth() method directly
         * returns a Dog object. Therefore, there's no need for explicit casting. The
         * compiler understands that the return type of the method
         * in the derived class is compatible with the reference type in the main
         * method.
         */
        System.out.println("newDog" + newDog.giveBirth());
    }

}
