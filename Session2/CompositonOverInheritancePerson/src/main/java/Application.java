import data.Adult;
import data.Person;

public class Application {
    public static void main(String[] args) {
        Person p = new Person("XYZ", 10, "1234");
        Adult xyz = new Adult(p);

        System.out.println(xyz.getPerson().getName());
    }
}
