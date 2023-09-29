package CoreJavaConcepts.JavaBasics.String_immutable.StringBufferVsStringBuilder.ThreadSafetyExamples;

public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        // Create two threads modifying the same StringBuilder
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("A");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("B");
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

        String result = stringBuffer.toString();
        System.out.println("Resulting string length: " + result.length());
    }
}
