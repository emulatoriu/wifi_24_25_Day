import data.Person;
import data.Vehicle;

public class Application {
    public static void main(String[] args) {
        boolean isWeatherNice = false;
        int counter = 0;
        float weight = 111111111111111123.4f;
        double height = 111111111111111111111111111111111111111123.4;
        byte age = 127;

        // Vorname, Nachname, SozialversNr
        String person1 = "Emad Easa, Blastraße 33, 123456, 22.03.1983";

        Person ana = new Person("Ana", "Viskovic", "123456");
        System.out.println();
        System.out.println(ana.getLastName());
        Person a = new Person();
        Person b = new Person("franz");

        // Reference type
        Person emad = new Person("Emad", "Easa", "123456");
        modifyPerson(emad);
        System.out.println(emad.getLastName());

        // Value type
        int number = 10;
        number = modifyNumber(number);
        System.out.println(number);
//        Vehicle audi = new Vehicle();
//        audi.setKm(40_000);
//        audi.setBrand("Audi");
//
//        System.out.println(audi.getMiles());
//        System.out.println(audi.getBrand());

        // String comparison
        String country = "Austria";
        String country2 = "Aus";
        String country3 = "tria";
        String both = country2 + country3;

        System.out.println(country.equals(both));
        System.out.println(country == country2);

        // Difference between post and pre increment
        number = 0;

        int counter2 = number++; // counter2 = 0
        // number += 1; // ==> number = number + 1
        int counter3 = ++number; // counter3 = 2, number = 2
        System.out.println(counter2);
        System.out.println(counter3);
        System.out.println(number);
    }

    public static int modifyNumber(int number) {
        number = number + 1;
        return number;
    }

    public static void modifyPerson(Person person) {
        person.setLastName("banana joe");
    }
}
