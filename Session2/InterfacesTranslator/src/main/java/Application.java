import logic.ApplicationRunner;
import logic.Decoder;
import logic.decodes.ADecoder;
import logic.decodes.EDecoder;
import logic.decodes.IDecoder;
import logic.decodes.ODecoder;

public class Application {
    public static void main(String[] args) {
        Decoder[] decoders = {
                new ADecoder(),
                new EDecoder(),
                new ODecoder(),
                new IDecoder()
        };
        String text = "1 l0v3 C0ding, ye4h";
        ApplicationRunner applicationRunner = new ApplicationRunner(decoders);
        applicationRunner.run(text);
    }
}
