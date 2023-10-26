package CoreJavaConcepts.OOPs_Concepts.Inheritance.IS_A_relationship.mulitple_inheritance;

interface Interface1 {
    void commonMethod();

    // this default method is make ambiguity, but no one do like this as default
    // means only one implementation
    // default void commonMethod() { -
    // System.out.println("Interface2: Implementation of common Method");
    // }
}

interface Interface2 {
    void commonMethod();
    // default void commonMethod() {
    // System.out.println("Interface2: Implementation of common Method");
    // }
}
