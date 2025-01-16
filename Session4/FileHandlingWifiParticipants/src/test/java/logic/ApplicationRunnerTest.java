package logic;

import data.Constants;
import logic.file.FileReaderService;
import logic.file.FileWriterService;
import logic.io.PrintService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ApplicationRunnerTest {
    @Mock
    FileReaderService fileReaderService;
    @Mock
    FileWriterService fileWriterService;
    @Mock
    RandomService randomService;
    @Mock
    PrintService printService;

    @InjectMocks
    ApplicationRunner applicationRunner;

    @BeforeEach
    void setUp() throws IOException {
        MockitoAnnotations.openMocks(this);
//        fileReaderService = mock(FileReaderService.class);
//        fileWriterService = mock(FileWriterService.class);
//        randomService = mock(RandomService.class);
//        applicationRunner = new ApplicationRunner(fileReaderService,  randomService, fileWriterService);
        when(fileReaderService.readFile(any())).thenReturn(List.of("Marcell", "Steffi", "Ana"));
        when(randomService.getRandomName(any())).thenReturn("Marcell");
    }

    @Test
    void run_good_case() throws IOException {
        String[] arguments = {""};

        applicationRunner.run(arguments);

        verify(fileReaderService, times(1)).readFile(eq(""));
        verify(randomService, times(1)).getRandomName(eq(List.of("Marcell", "Steffi", "Ana")));
        verify(fileWriterService, times(1)).writeFile(eq(""), any());
        verify(printService, times(1)).println("Marcell");
        verify(printService, times(1)).println(Constants.NOICE);
    }

    @Test
    void run_no_arguments() throws IOException {
        String[] arguments = {};

        applicationRunner.run(arguments);

        verify(printService, times(1)).println(eq(Constants.MISSING_ARGUMENTS));
        verify(fileReaderService, times(0)).readFile(any());
        verify(randomService, times(0)).getRandomName(any());
        verify(fileWriterService, times(0)).writeFile(any(), any());
    }

    @Test
    void run_read_exception() throws IOException {
        String[] arguments = {""};

        when(fileReaderService.readFile(any())).thenThrow(new IOException());

        assertThrows(RuntimeException.class, () -> applicationRunner.run(arguments), "Execution failed");
        verify(fileReaderService, times(1)).readFile(eq(""));
        verify(randomService, times(0)).getRandomName(any());
        verify(fileWriterService, times(0)).writeFile(any(), any());
        verify(printService, times(0)).println(any());
    }

    @Test
    void run_write_exception() throws IOException {
        //given
        String[] arguments = {""};

        //when
        doThrow(IOException.class).when(fileWriterService).writeFile(any(), any());

        //then
        assertThrows(RuntimeException.class, () -> applicationRunner.run(arguments), "Execution failed");
        verify(fileReaderService, times(1)).readFile(eq(""));
        verify(randomService, times(1)).getRandomName(eq(List.of("Marcell", "Steffi", "Ana")));
        verify(fileWriterService, times(1)).writeFile(eq(""), any());
    }
}