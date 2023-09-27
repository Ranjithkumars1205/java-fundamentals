package String_immutable.Compare;

public class Equals {
    public static void main(String[] args) {
        String str1 = "H";
        String str2 = "Hello";
        String str3 = new String("hello");
        str1 = "Hello";
        System.out.println("equals " + str1.equals(str2) + " " + str1); // true
        // The equals() method compares the content of two strings to determine if they
        // are equal.

        System.out.println(str1 == str3); // false (because str3 refers to instance created in nonpool)
        // The == operator checks for reference equality, comparing if two string
        // references point to the same memory location.
        // str3 points to a new string object created with the new keyword, even though
        // its content is "Hello".

        System.out.println(str1 == str2); // true
        // str1 and str2 both point to the same string literal "Hello", so they are
        // equal and share the same reference.

        String str4 = "HELLO";
        System.out.println("equalsIgnoreCase " + str1.equalsIgnoreCase(str4)); // true
        // This method performs a case-insensitive comparison of two strings.

        String str = "Hello, World!";
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println(startsWithHello + " " + endsWithWorld);

    }

}
