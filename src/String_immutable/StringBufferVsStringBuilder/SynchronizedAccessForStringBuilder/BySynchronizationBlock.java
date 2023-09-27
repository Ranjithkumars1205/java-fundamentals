package String_immutable.StringBufferVsStringBuilder.SynchronizedAccessForStringBuilder;

/**
 * To achieve synchronized access to a StringBuilder instance, you can use
 * synchronization blocks or methods to ensure that only one thread can access
 * and modify the StringBuilder at a time. This way, you prevent concurrent
 * modifications and maintain thread safety.
 */
public class BySynchronizationBlock {
    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        Runnable task1 = () -> {
            synchronized (stringBuilder) {
                for (int i = 0; i < 1000; i++) {
                    stringBuilder.append("A");
                }

            }
        };

        Runnable task2 = () -> {
            synchronized (stringBuilder) {
                for (int i = 0; i < 1000; i++) {
                    stringBuilder.append("B");
                }
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

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
