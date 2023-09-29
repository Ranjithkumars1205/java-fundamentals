package CoreJavaConcepts.OOPs_Concepts.Inheritance.IS_A_relationship.mulitple_inheritance;

class MyClass implements Interface1, Interface2 {
    @Override
    public void commonMethod() {
        System.out.println("Implementation of common Method");
    }
}

/***
 * This allows you to achieve multiple inheritance for the same method, but it's
 * important to note that the implementation of the method is
 * provided in the class itself to resolve any ambiguity. This approach helps
 * avoid the diamond problem associated with traditional multiple
 * inheritance, where it's unclear which superclass's method should be
 * inherited.
 */
