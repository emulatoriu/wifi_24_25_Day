package logic;

import data.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @ParameterizedTest
    @MethodSource("initialize")
    void getPersonsUnderCertainAge(List<Person> persons, int age, List<Person> expected) {
        PersonService personService = new PersonService();

        List<Person> result = personService.getPersonsUnderCertainAge(persons, age);

        assertEquals(expected, result);
    }

    static Stream<Arguments> initialize() {
        Person karl = new Person("Karl", "Strache", LocalDate.of(1970, 5, 5));
        Person donald = new Person("Donald", "Trump", LocalDate.of(1940, 1, 1));
        Person hillary = new Person("Hillary", "Clinton", LocalDate.of(1950, 1, 1));
        return Stream.of(
                Arguments.of(
                        List.of(
                                karl,
                                donald,
                                hillary
                        ), 79, List.of(
                                karl,
                                hillary
                        )
                ),
                Arguments.of(List.of(), 100, List.of()),
                Arguments.of(List.of(
                        karl,
                        donald,
                        hillary
                ), 1, List.of())
        );
    }
}