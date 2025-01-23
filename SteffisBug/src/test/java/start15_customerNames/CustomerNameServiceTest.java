package start15_customerNames;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CustomerNameServiceTest {

    @ParameterizedTest
    @MethodSource("initialize")
    void countNames(List<String> names, Map<String, Long> expected) {
        CustomerNameService customerNameService = new CustomerNameService();

        Map<String, Long> result = customerNameService.countNames(names);

        //assertEquals(expected, result);
        assertTrue(mapEquals(expected, result));
    }

    boolean mapEquals(Map<String, Long> map1, Map<String, Long> map2) {
        if (map1.size() != map2.size()) {
            return false;
        }

        return map1.entrySet().stream().allMatch(
                entry -> entry.getValue().equals(map2.get(entry.getKey()))
        );
    }

    static Stream<Arguments> initialize() {
        return Stream.of(
                Arguments.of(
                        List.of("Karl", "Paula", "Thomas", "Anna", "Thomas", "Anna", "Mirko", "Melanie", "Anna", "Melanie"),
                        new HashMap<>(Map.of(
                                "Karl", 1,
                                "Paula", 1,
                                "Thomas", 2,
                                "Anna", 3,
                                "Mirko", 1,
                                "Melanie", 2
                        ))
                )
        );
    }
}



