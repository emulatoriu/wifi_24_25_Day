package logic;

public class DoubleStarTranslate implements Decoder {
    @Override
    public String decode(String text) {
        return String.join("**", text.split(""));
    }
}
