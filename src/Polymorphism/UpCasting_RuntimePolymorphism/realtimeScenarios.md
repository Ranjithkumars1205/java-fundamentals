
Upcasting is the typecasting of a child object to a parent object. It is done implicitly by the compiler and does not require any explicit code. For example, if Animal is a parent class and Dog is a child class, then the following code is valid:

Java
Animal animal = new Dog();
Use code with caution. Learn more
In this code, the animal variable is of type Animal, but it is referring to an object of the Dog class. This is allowed because Dog is a subclass of Animal.

Upcasting is useful in many real-time scenarios. For example, it can be used to:

Write code that is more generic and can be used with different types of objects.
Avoid the need to write multiple copies of the same code for different types of objects.
Make code more readable and easier to maintain.
Here are some examples of real-time scenarios where upcasting can be used:

A game that has different types of characters, such as humans, animals, and monsters. The game can use upcasting to store all of the characters in a single array, even though they are of different types.
A library that has different types of books, such as novels, textbooks, and reference books. The library can use upcasting to store all of the books in a single list, even though they are of different types.
A company that has different types of employees, such as sales representatives, engineers, and managers. The company can use upcasting to store all of the employees in a single database, even though they are of different types.