package logic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserNameServiceTest {

//    @Test
//    void checkIfPalindrom() {
//        String name = "Ana";
//        UserNameService userNameService = new UserNameService();
//
//        boolean result = userNameService.checkIfPalindrom(name);
//
//        assertTrue(result);
//    }

    UserNameService userNameService;
    @BeforeEach
    void setUp() {
        userNameService = new UserNameService();
    }

    @Test
    @DisplayName("CheckIfSameFromBackwards")
    void checkIfPalindromNumber() {
        String name = "123321";

        boolean result = userNameService.checkIfPalindrom(name);

        assertTrue(result);
    }

    @Test
    void checkIfPalindromNegativeNumber() {
        String name = "-22";

        boolean result = userNameService.checkIfPalindrom(name);

        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ana", "otto", "Babab", "123321", "----", " "})
    void checkIfPalindrom(String name) {
        // Tripple A pattern
        // Arrange
//        UserNameService userNameService = new UserNameService();
        // Act
        boolean result = userNameService.checkIfPalindrom(name);
        // Assert
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"Mimi, 5, true",
            "Timothy, 6, false",
            "Marcell, 10, true"})
    void checkIfNameShorterThan(String name, int maxLength, boolean expected) {
        boolean result = userNameService.checkIfNameShorterThan(name, maxLength);

        assertEquals(expected, result);
    }
}