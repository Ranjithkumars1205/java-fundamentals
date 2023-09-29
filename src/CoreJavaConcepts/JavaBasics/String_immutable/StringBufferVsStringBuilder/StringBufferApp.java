package CoreJavaConcepts.JavaBasics.String_immutable.StringBufferVsStringBuilder;

public class StringBufferApp {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        Thread thread1 = new Thread(() -> {
            stringBuffer.append(", ");
            // ... other thread-safe operations
        });

        Thread thread2 = new Thread(() -> {
            stringBuffer.append("World!");
            // ... other thread-safe operations
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String result = stringBuffer.toString();
        System.out.println(result);
    }

}
