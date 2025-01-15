package logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileWriterService {
    public void writeFile(String filePath, String text) throws IOException {
        Path path = Path.of(filePath);
        Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
    }
}
