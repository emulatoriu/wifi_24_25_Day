package logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileWriter {
    public void write(String filePath, String content) throws IOException {
        Path path = Path.of(filePath);
        Files.write(path, (content+"\n").getBytes(), StandardOpenOption.APPEND);
    }
}
