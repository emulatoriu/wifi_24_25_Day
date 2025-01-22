import logic.ThreadCounter;

public class Application {
    public static void main(String[] args) {
        Thread t1 = new ThreadCounter("Thread1");
        Thread t2 = new ThreadCounter("Thread2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End of program");
    }
}
