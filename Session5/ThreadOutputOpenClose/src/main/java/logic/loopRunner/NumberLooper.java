package logic.loopRunner;

import java.util.stream.IntStream;

public class NumberLooper implements LoopRunner{
    private final int lowerBound;
    private final int upperBound;

    public NumberLooper(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public void executeLoop() {
        if(lowerBound > upperBound) throw new RuntimeException();
        IntStream.rangeClosed(lowerBound, upperBound)
                .forEach(number -> System.out.println(number));
    }
}
