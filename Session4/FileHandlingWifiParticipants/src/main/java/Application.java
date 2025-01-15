import logic.FileReaderService;
import logic.FileWriterService;
import logic.RandomService;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        FileReaderService fileReaderService = new FileReaderService();
        try {
            String filePath = "D:\\EigeneDateien\\WIFI\\KursteilneherINNEN.txt";
            List<String> content = fileReaderService.readFile(filePath);
            Random random = new Random();
            RandomService randomService = new RandomService(random);
            String randomName = randomService.getRandomName(content);
            System.out.println(randomName);
            FileWriterService fileWriterService = new FileWriterService();
            fileWriterService.writeFile(filePath, "\nEmad");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
