package logic;

import data.Constants;
import logic.file.FileReaderService;
import logic.file.FileWriterService;
import logic.io.PrintService;

import java.io.IOException;
import java.util.List;

public class ApplicationRunner {
    private final FileReaderService fileReaderService;
    private final RandomService randomService;
    private final FileWriterService fileWriterService;
    private final PrintService printService;

    public ApplicationRunner(FileReaderService fileReaderService, RandomService randomService, FileWriterService fileWriterService, PrintService printService) {
        this.fileReaderService = fileReaderService;
        this.randomService = randomService;
        this.fileWriterService = fileWriterService;
        this.printService = printService;
    }

    public void run(String arguments[]) {
        if(arguments.length != 1) {
            printService.println(Constants.MISSING_ARGUMENTS);
            return;
        }
        String filePath = arguments[0];
        try {
            //String filePath = "D:\\EigeneDateien\\WIFI\\KursteilneherINNEN.txt";
            List<String> content = fileReaderService.readFile(filePath);
            String randomName = randomService.getRandomName(content);
            printService.println(randomName);
            printService.println(Constants.NOICE);
            fileWriterService.writeFile(filePath, "\nEmad");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
