package logic;

public class ApplicationRunner {
    private final Decoder[] decoders;

    public ApplicationRunner(Decoder[] decoders) {
        this.decoders = decoders;
    }

    public void run(String text) {
        for (Decoder decoder : decoders) {
            text = decoder.decode(text);
        }
        System.out.println(text);
//        Decoder singleStar = new SingleStarTranslate();
//        String translated = singleStar.decode("I love Coding");
//        System.out.println(translated);
    }
}
