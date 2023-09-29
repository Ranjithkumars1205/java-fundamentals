package CoreJavaConcepts.OOPs_Concepts.Encapsulation.AccessModifier;

import CoreJavaConcepts.OOPs_Concepts.Abstraction.AbstractClass.Parent;

/**
 * If you don't use any modifier, it is treated as default by default. The
 * default modifier is accessible only within package. It cannot be accessed
 * from outside the package. It provides more accessibility than private. But,
 * it is more restrictive than protected, and public.
 * 
 */

public class DefaultModifier {
    public static void main(String[] args) {
        Parent p = new Parent(null, 0, null);
        // p.setChild(null); //Compile Time Error

    }

}
