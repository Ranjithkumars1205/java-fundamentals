package String_immutable.StringBufferVsStringBuilder;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");

        Thread thread1 = new Thread(() -> {
            stringBuilder.append(", ");
        });

        Thread thread2 = new Thread(() -> {
            stringBuilder.append("World!");
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
        System.out.println(result);

    }

}
