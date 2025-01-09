import repository.CustomList;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        CustomList<Integer> numbers = new CustomList<>(new ArrayList<>());
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.print();

        Person p1 = new Person("abc", 1);
        Person p2 = new Person("def", 2);
        Person p3 = new Person("ghi", 3);
        CustomList<Person> persons = new CustomList<>(new ArrayList<>());

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        persons.print();

    }
}
