package logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class RandomServiceTest {

    @Mock
    Random random;

    @InjectMocks
    RandomService randomService;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Ana", "Steffi", "Marcell", "Emad"})
    void getRandomName(String expected) {
        RandomService spyRandomService = spy(randomService);
        when(spyRandomService.getRandomName(anyList())).thenReturn(expected);

        String result = spyRandomService.getRandomName(List.of());

        verify(spyRandomService, times(1)).getRandomName(any());
        assertEquals(expected, result);
    }

}