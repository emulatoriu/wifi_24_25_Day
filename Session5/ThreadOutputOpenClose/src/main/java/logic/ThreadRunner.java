package logic;

import logic.loopRunner.LoopRunner;

public class ThreadRunner extends Thread{
    private final LoopRunner loopRunner;

    public ThreadRunner(LoopRunner loopRunner) {
        this.loopRunner = loopRunner;
    }

    @Override
    public void run() {
        loopRunner.executeLoop();
    }
}
