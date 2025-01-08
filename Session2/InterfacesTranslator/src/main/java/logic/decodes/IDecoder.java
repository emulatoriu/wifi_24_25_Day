package logic.decodes;

import logic.Decoder;

public class IDecoder implements Decoder {
    @Override
    public String decode(String text) {
        return text.replaceAll("1", "I");
    }
}
