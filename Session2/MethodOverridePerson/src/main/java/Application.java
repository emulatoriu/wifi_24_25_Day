import data.Person;

public class Application {
    public static void main(String[] args) {
        Person person1 = new Person("abc", 20);
        Person person2 = new Person("abc", 20);
        Person person3 = person1;
        System.out.println(person1.equals(person2));
        System.out.println(person1 == person3);
    }
}
