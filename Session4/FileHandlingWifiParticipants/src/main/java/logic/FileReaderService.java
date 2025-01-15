package logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderService {
    public List<String> readFile(String filePath) throws IOException {
        Path path = Path.of(filePath);
        return Files.readAllLines(path);
    }
}
