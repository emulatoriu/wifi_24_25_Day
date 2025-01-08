package logic.decodes;

import logic.Decoder;

public class EDecoder implements Decoder {
    @Override
    public String decode(String text) {
        return text.replaceAll("3", "E");
    }
}
