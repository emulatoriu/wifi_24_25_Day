import data.Person;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        List<Person> personList = new ArrayList<>();

        Person p1 = new Person("abc", 123, "red");
        Person p2 = new Person("abc", 123, "red");

        persons.add(p1);
        persons.add(p2);
        personList.add(p1);
        personList.add(p2);

        for(int i=0; i<personList.size(); i++) {
            System.out.println(personList.get(i));
        }

        System.out.println("--------------------");
        Iterator<Person> listIterator = personList.iterator();
        while(listIterator.hasNext()) {
            Person next = listIterator.next();
            System.out.println(next);
        }

        System.out.println("--------------------");
        Iterator<Person> iterator = persons.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        System.out.println(persons);

    }
}
