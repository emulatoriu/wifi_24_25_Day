package logic.loopRunner;

public class CharacterLooper implements LoopRunner{
    private final char lowerBound;
    private final char upperBound;

    public CharacterLooper(char lowerBound, char upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public void executeLoop() {
        if(lowerBound > upperBound) throw new RuntimeException();
        for (char c = lowerBound; c <= upperBound; c++) {
            System.out.println(c);
        }
    }
}
