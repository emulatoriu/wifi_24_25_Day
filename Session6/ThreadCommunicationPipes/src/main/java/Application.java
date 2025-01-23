import logic.ReadService;
import logic.WriteService;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Application {
    public static void main(String[] args) {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        try {
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
            Thread writer = new WriteService(pipedOutputStream);
            Thread reader = new ReadService(pipedInputStream);
            writer.start();
            reader.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
