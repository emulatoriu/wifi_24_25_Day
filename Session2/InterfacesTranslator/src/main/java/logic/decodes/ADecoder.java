package logic.decodes;

import logic.Decoder;

public class ADecoder implements Decoder {
    @Override
    public String decode(String text) {
        return text.replaceAll("4", "A");
    }
}
