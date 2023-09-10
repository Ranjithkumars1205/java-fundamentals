Before Java5, it was not possible to override any method by changing the return type. But now, since Java5, it is possible to override method by changing the return type if subclass overrides any method whose return type is Non-Primitive but it changes its return type to subclass type

***Covariant return types in Java can help avoid casting by allowing you to return a more specific subtype in overridden methods of derived classes. This means that when you use covariant return types, you don't need to perform explicit type casting when calling methods on objects of the derived class. Here's a clear difference between using covariant return types and not using them***

Using covariant return types improves code readability and reduces the risk of runtime errors that can occur due to incorrect casting. It allows your code to more accurately reflect the specific types returned by overridden methods in derived classes. This can make your code more intuitive and less error-prone when working with complex class hierarchies.

 Also, even if we write the code for the 10 - 15 classes, there would be no confusion regarding the return types of the methods. All this is possible because of the covariant return type.

class A1  
{  
    A1 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A1");  
    }  
}  
  
  
// A2 is the child class of A1  
class A2 extends A1  
{  
    @Override  
    A1 foo()  
    {  
        return this;  
    }  
      
    void print()  
    {  
        System.out.println("Inside the class A2");  
    }  
}  
  
// A3 is the child class of A2  
class A3 extends A2  
{  
    @Override  
    A1 foo()  
    {  
        return this;  
    }  
      
    @Override  
    void print()  
    {  
        System.out.println("Inside the class A3");  
    }  
}  
  
public class CovariantExample  
{  
    // main method  
    public static void main(String argvs[])  
    {  
       A1 a1 = new A1();  
         
       // this is ok  
       a1.foo().print();  
         
       A2 a2 = new A2();  
         
       // we need to do the type casting to make it   
       // more clear to reader about the kind of object created   
       ((A2)a2.foo()).print();  
         
       A3 a3 = new A3();  
         
       // doing the type casting  
       ((A3)a3.foo()).print();  
         
    }  
}  