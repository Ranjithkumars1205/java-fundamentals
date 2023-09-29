package CoreJavaConcepts.JavaBasics.String_immutable.StringBufferVsStringBuilder.ThreadSafetyExamples;

public class StringBuilderExample {

    /**
     * Sure, let's demonstrate an example of unpredictable behavior when using
     * StringBuilder in a multi-threaded environment, illustrating why it's not
     * thread-safe.
     * Check StringBufferExample as well
     * 
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        // Create two threads modifying the same StringBuilder
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("A");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("B");
            }
        });

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
