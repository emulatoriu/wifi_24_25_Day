package logic;

import data.Person;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class PersonService {
    public List<Person> getPersonsUnderCertainAge(List<Person> persons, int age) {
        return persons.stream()
                .filter(person ->
                        isPersonYoungerThan(age, person))
                .toList();
    }

    private boolean isPersonYoungerThan(int age, Person person) {
        return ChronoUnit.YEARS.between(person.birthdate(), LocalDate.now()) < age;
    }
}
