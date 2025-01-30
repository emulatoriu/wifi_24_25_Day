import data.Person;
import logic.Checker;
import logic.PersonService;
import logic.StartsWithName;

import java.util.List;
import java.util.function.BiPredicate;

public class Application {
    public static void main(String[] args) {
        Checker checkFirstName = person -> person.name().startsWith("A");
        Checker checkFirstNameClass = new StartsWithName();

        Person p = new Person("ABob", 30, List.of());
        boolean startsWithA = checkFirstName.check(p);
        boolean startsWithAClass = checkFirstNameClass.check(p);
        System.out.println(startsWithA);

        List<Person> persons = List.of(
                new Person("Anna Müller", 28, List.of("Schach", "Lesen", "Wandern")),
                new Person("Maximilian Schmidt", 35, List.of("Programmieren", "Radfahren", "Fotografie")),
                new Person("Sophie Becker", 24, List.of("Klavier spielen", "Zeichnen", "Gaming")),
                new Person("Lukas Wagner", 30, List.of("Fußball", "Kochen", "Reisen")),
                new Person("Emilia Fischer", 26, List.of("Schreiben", "Tanzen", "Yoga")));

        PersonService personService = new PersonService();
        Checker over30Checker = person -> person.age() > 30;
        List<Person> personsOver30 = personService.filter(persons, over30Checker);
        List<Person> personsOver31 = personService.filter(persons, (person -> person.age() > 31));
        List<Person> personsStartWithA = personService.filter(persons, (person -> person.name().startsWith("A")));
        List<Person> personsWithoutHobbies = personService.filter(persons, (person -> person.hobbies().isEmpty()));

        BiPredicate<Person, Person> isFirstPersonOlder = (person1, person2) -> person1.age() > person2.age();
        BiPredicate<Person, String> isPersonsNameEqual = (person, name) -> person.name().equalsIgnoreCase(name);
        System.out.println(isFirstPersonOlder.test(persons.get(0), persons.get(1)));
        System.out.println(isPersonsNameEqual.test(persons.get(2), "sophie Becker"));
    }
}
