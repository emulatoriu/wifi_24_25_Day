package logic;

public class SingleStarTranslate implements Decoder {
    @Override
    public String decode(String text) {
        return String.join("*", text.split(""));
    }
}
