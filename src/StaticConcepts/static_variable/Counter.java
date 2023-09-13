package StaticConcepts.static_variable;

public class Counter {
    public static int count = 0;
    public int instanceCount = 0;
    public static int staticBlockCount = 0;

    static {
        staticBlockCount++; // it run only once for the entire class unlike ngOnInit in angular.
    }

    public Counter() {
        count++;
        instanceCount++;
    }
}
