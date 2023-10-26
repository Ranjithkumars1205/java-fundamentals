Abstract:

both abstract and all none abstract method suppored except default methods(it is supported only in interface only)
default method not supported but we can have final method
there is no restriction for variables.
It can't be instantiated (Both interface and abstract class)
It can have constructor and even main method as well. But It can't be instantiated.
If there is an abstract method in a class, that class must be abstract.
The abstract class can also be used to provide some implementation of the interface.

Interface:
only abstract method
But it can have non-abstract method with default, static and private only.
default method is not supported in multiple interface inheritance supported with non-abstract method.
but no one do like that. because default means some default action.
private data member is not allowed
data member must be initialized and can't be modified ( Interface fields are public, static and final by default, and the methods are public and abstract.)
It can't be instantiated and also it is not class.
It provides total abstraction;
You cannot use the abstract when defining methods within an interface
default methods are only supported in interface. not in abstract classes and normal classes

Common:
We must be implement the abstract methods for both abstract classes and interfaces as soon as we extending them with class.

If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract or Interface (check IHuman interface file)
