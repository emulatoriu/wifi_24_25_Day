package logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    @Test
    void getRandomName() {
        RandomService spyRandomService = spy(randomService);
        when(spyRandomService.getRandomName(anyList())).thenReturn(any());

        spyRandomService.getRandomName(List.of());

        verify(spyRandomService, times(1)).getRandomName(any());
    }

    @Test
    void getRandomName_not_reached() {
        RandomService spyRandomService = spy(randomService);

        String result = randomService.getRandomName(List.of());

        verify(spyRandomService, times(0)).getRandomName(any());
        assertEquals("", result);
    }

}