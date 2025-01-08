import data.Adult;
import data.Child;
import data.Person;

public class Application {
    public static void main(String[] args) {
        Person person1 = new Person("ABC", 123, "lesen");
        Person emad = new Adult("Emad", 29, "mit Familie blödeln", "Trainer");
        System.out.println(emad.getName());

        Person[] wifiCourse = {
                new Adult("Ana", 20, "Schwimmen", "Softwaredeveloper"),
                new Adult("Steffi", 20, "Schwimmen", "Softwaredeveloper"),
                new Adult("Attila", 20, "Schwimmen", "Softwaredeveloper"),
                new Child("Emad", 10, "Schiwmmen", "WIFI")
        };

        for(Person p : wifiCourse) {
            if(p instanceof Adult adult) { // pattern matching
                System.out.println(adult.getProfession());
            } else if (p instanceof Child child) {
                System.out.println(child.getSchool());
            }
        }
    }
}
