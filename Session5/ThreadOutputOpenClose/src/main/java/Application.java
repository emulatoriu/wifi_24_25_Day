import logic.ThreadRunner;
import logic.loopRunner.CharacterLooper;
import logic.loopRunner.LoopRunner;
import logic.loopRunner.NumberLooper;
import logic.loopRunner.SplitLooper;

public class Application {
    public static void main(String[] args) {
        LoopRunner numberLooper = new NumberLooper(0, 1000);
        LoopRunner characterLooper = new CharacterLooper('A', 'z');
        LoopRunner splitLooper = new SplitLooper("Hello World");
        Thread t1 = new ThreadRunner(numberLooper);
        Thread t2 = new ThreadRunner(characterLooper);
        Thread t3 = new ThreadRunner(splitLooper);
        t1.start();
        t2.start();
        t3.start();
    }
}
