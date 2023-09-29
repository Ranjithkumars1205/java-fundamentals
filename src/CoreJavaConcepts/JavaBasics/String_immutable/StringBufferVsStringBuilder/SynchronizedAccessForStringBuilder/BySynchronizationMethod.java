package CoreJavaConcepts.JavaBasics.String_immutable.StringBufferVsStringBuilder.SynchronizedAccessForStringBuilder;
// Encapsulate the critical section within a synchronized method, ensuring only one thread can execute the method at a time.

public class BySynchronizationMethod {
    private static StringBuilder stringBuilder = new StringBuilder();

    public static synchronized void modifyStringBuilder() {
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append("A");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> modifyStringBuilder());
        Thread thread2 = new Thread(() -> modifyStringBuilder());
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String result = stringBuilder.toString();
        System.out.println("Resulting string length: " + result.length());

    }

}
