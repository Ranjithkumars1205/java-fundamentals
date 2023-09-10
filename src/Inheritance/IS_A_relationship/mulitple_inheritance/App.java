package Inheritance.IS_A_relationship.mulitple_inheritance;

/**
 * It's important to note that while Java supports multiple inheritance of
 * interfaces,
 * it's different from multiple inheritance of classes, where a class inherits
 * "state and behavior" from multiple classes. In interface-based multiple
 * inheritance, a class inherits method signatures from multiple interfaces, but
 * it doesn't inherit any implementation or state. This avoids the complexities
 * and ambiguities associated with traditional multiple inheritance.
 */

public class App extends Exception {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.commonMethod(); // Calls the implementation in MyClass
    }

}

/**
 * In this example, MyClass implements both Interface1 and Interface2, both of
 * which declare a method with the same signature commonMethod().
 * To avoid any conflicts, you must provide an implementation for commonMethod()
 * in MyClass. When you call commonMethod() on an instance of MyClass, it will
 * use the implementation defined in MyClass.
 */
