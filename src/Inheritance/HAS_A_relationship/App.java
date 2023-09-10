package Inheritance.HAS_A_relationship;

/**
 * Code reuse is also best achieved by aggregation when there is no is-a
 * relationship.
 * It's like service in angular (partially)
 */
public class App {

    public static void main(String[] args) throws Exception {

        Department it = new Department("IT", "A block");
        University jit = new University("JIT");
        jit.addDepartment(it);
    }

}
