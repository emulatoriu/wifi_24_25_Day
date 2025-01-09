package persons.logic;

import persons.data.Person;

import java.util.List;

public class PersonService {
    public Double getAverageAge(List<Person> persons) {
        return persons.stream()
                .mapToInt(person->person.age())
                .average()
                .getAsDouble();
    }
}
