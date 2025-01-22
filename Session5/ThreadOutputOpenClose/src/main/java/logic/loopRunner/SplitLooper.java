package logic.loopRunner;

public class SplitLooper implements LoopRunner {
    private final String stringToSplit;

    public SplitLooper(String stringToSplit) {
        this.stringToSplit = stringToSplit;
    }

    @Override
    public void executeLoop() {
        String[] splittedString = stringToSplit.split("");
        for (int i = 0; i < splittedString.length; i++) {
            System.out.println(splittedString[i]);
        }
    }
}
