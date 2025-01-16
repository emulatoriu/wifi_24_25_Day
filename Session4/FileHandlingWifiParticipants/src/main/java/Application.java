import logic.ApplicationRunner;
import logic.RandomService;
import logic.file.FileReaderService;
import logic.file.FileWriterService;
import logic.io.PrintService;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        FileReaderService fileReaderServiceText = new FileReaderService();
        Random random = new Random();
        RandomService randomService = new RandomService(random);
        FileWriterService fileWriterService = new FileWriterService();
        PrintService printService = new PrintService();
        ApplicationRunner applicationRunner = new ApplicationRunner(fileReaderServiceText, randomService, fileWriterService, printService);
        applicationRunner.run(args);
    }
}
