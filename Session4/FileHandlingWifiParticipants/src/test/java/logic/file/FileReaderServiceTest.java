package logic.file;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderServiceTest {

    @ParameterizedTest
    @MethodSource("initialize")
    void readFile(String content, List<String> expected) throws IOException {
        Path testPath = Files.createTempFile("test", ".txt");
        Files.write(testPath, content.getBytes());
        FileReaderService fileReaderService = new FileReaderService();

        List<String> result = fileReaderService.readFile(testPath.toString());

        assertEquals(expected, result);
    }

    static Stream<Arguments> initialize() {
        return Stream.of(
                Arguments.of(
                        "", List.of()
                ),
                Arguments.of(
                        "Hello\nWorld", List.of("Hello", "World")
                )
        );
    }
}