package CoreJavaConcepts.OOPs_Concepts.Polymorphism.StaticBindingVsDynamicBinding;

public class DynamicBinding {

}
// class Animal{
// void eat(){System.out.println("animal is eating...");}
// }

// class Dog extends Animal{
// void eat(){System.out.println("dog is eating...");}

// public static void main(String args[]){
// Animal a = new Dog(); // When type of the object is determined at run-time,
// it
// is known as dynamic binding.

// a.eat();
// }
// }

/**
 * In the above example object type cannot be determined by the compiler,
 * because the instance of Dog is also an instance of Animal.So compiler doesn't
 * know its type, only its base type.
 */