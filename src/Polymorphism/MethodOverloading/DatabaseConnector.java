package Polymorphism.MethodOverloading;

/**
 * Here, the connect method is overloaded to allow for connection using
 * different sets of parameters.
 * Method overloading enhances the flexibility and readability of your code by
 * allowing you to use the same method name for related operations, making it
 * easier for developers to understand and use your classes and APIs.
 */
public class DatabaseConnector {
    public void connect(String connectionString) {
        // Connect to the database using the provided connection string.
    }

    public void connect(String server, String database, String username, String password) {
        // Connect to the database using server, database, username, and password.
    }

}
