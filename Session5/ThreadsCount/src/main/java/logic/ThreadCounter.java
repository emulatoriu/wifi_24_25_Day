package logic;

public class ThreadCounter extends Thread {

    private final String threadName;

    public ThreadCounter(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("%s: %d".formatted(threadName, i));
        }
    }
}
