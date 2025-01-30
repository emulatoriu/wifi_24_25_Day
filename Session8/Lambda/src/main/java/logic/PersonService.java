package logic;

import data.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public List<Person> filter(List<Person> persons, Checker checker) {
        List<Person> result = new ArrayList<>();
        for(Person p : persons) {
            if(checker.check(p)) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> getPersonsWithCertainHobby(List<Person> persons, String hobby) {
        persons.stream()
                .forEach(person -> System.out.println(person));

        return persons.stream()
                .filter(person -> person.hobbies().contains(hobby))
                .toList();
    }


    public List<Person> filterByAgeOver30(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for(Person p : persons) {
            if(p.age()>30) {
                result.add(p);
            }
        }
        return result;
    }
    public List<Person> filterByAgeOver31(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for(Person p : persons) {
            if(p.age()>31) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> filterByNameStartsWithA(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for(Person p : persons) {
            if(p.name().startsWith("A")) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> filterByNameStartsWithB(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for(Person p : persons) {
            if(p.name().startsWith("B")) {
                result.add(p);
            }
        }
        return result;
    }
}
