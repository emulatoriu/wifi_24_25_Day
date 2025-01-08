package logic.decodes;

import logic.Decoder;

public class ODecoder implements Decoder {
    @Override
    public String decode(String text) {
        return text.replaceAll("0", "O");
    }
}
