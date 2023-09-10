package StaticConcepts.static_variable;

public class Counter {
    public static int count = 0;
    public int instanceCount = 0;

    public Counter() {
        count++;
        instanceCount++;
    }
}
