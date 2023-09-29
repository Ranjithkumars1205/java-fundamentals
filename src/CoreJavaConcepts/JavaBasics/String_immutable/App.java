package CoreJavaConcepts.JavaBasics.String_immutable;

/**
 * In Java, strings are indeed immutable. This means that the contents of a
 * string cannot be changed after it is created. When you modify a string in
 * Java, what happens behind the scenes is that a new string is created with the
 * modified content, while the original string remains unchanged.
 * https://www.javatpoint.com/immutable-string
 */

public class App {
    public static void main(String[] args) {
        String s1 = "Java";
        char ch[] = { 's', 't', 'r', 'i', 'n', 'g' };
        String s2 = new String(ch);
        String s3 = new String("example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String originalString = "H"; // In the line String originalString = "H";, you're creating a String object
                                     // with the value "H" and assigning it to the variable originalString. This
                                     // String object is indeed immutable; you cannot modify its value.
        String newString = originalString;
        newString = "World";
        originalString = "Hello"; // Later, in the line originalString = "Hello";, you're creating a new String
                                  // object with the value "Hello" and updating the variable originalString to
                                  // reference this new String object. The previous String object with the value
                                  // "H" is no longer referenced and will eventually be garbage-collected.
        String modifiedString = originalString.concat(", World!");
        // originalString = originalString.concat(", World!");
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
        System.out.println(originalString + ", " + newString);
        /**
         * In this example, when you call concat to concatenate ", World!" to the
         * original string, it creates a new string with the combined content. The
         * original originalString remains unchanged.
         * 
         * In summary, the immutability of a String means that the content of a String
         * object cannot be changed after creation. However, you can reassign a String
         * variable to reference a new String object, effectively changing the "value"
         * that the variable holds.
         */
    }

}
