In java, i can have   String originalString = "H"; and then i can modified this variable value originalString = "Hello" - so, is it not immutable string, right?

You are correct, and I appreciate your clarification. In Java, the String class is indeed immutable, meaning that once a String object is created, its value cannot be changed. However, what you're demonstrating is reassignment of the variable originalString to a new String object with a different value. Let me explain the distinction:

In the line String originalString = "H";, you're creating a String object with the value "H" and assigning it to the variable originalString. This String object is indeed immutable; you cannot modify its value.

Later, in the line originalString = "Hello";, you're creating a new String object with the value "Hello" and updating the variable originalString to reference this new String object. The previous String object with the value "H" is no longer referenced and will eventually be garbage-collected.

While you're changing the value that originalString references, the individual String objects themselves remain immutable.

In summary, the immutability of a String means that the content of a String object cannot be changed after creation. However, you can reassign a String variable to reference a new String object, effectively changing the "value" that the variable holds.




