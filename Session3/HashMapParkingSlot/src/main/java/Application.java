import data.Person;
import data.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Map<Integer, Vehicle> parkingSlots = new HashMap<>();

        Vehicle volvo = new Vehicle("123", 4, 150, "Volvo");
        Vehicle fiat = new Vehicle("456", 4, 90, "Fiat");
        Vehicle yamaha = new Vehicle("789", 2, 150, "Yamaha");

        parkingSlots.put(1, volvo);
        parkingSlots.put(2, fiat);
        parkingSlots.put(3, yamaha);

        System.out.println(parkingSlots.get(2));
        Vehicle ferrari = new Vehicle("", 4, 650, "Ferrari");

        parkingSlots.put(2, ferrari);
        System.out.println(parkingSlots.get(2));

        Person p1 = new Person("Marcell");
        Person p2 = new Person("Steffi");
        Person p3 = new Person("Ana");
        Person p4 = new Person("Ana");

        Vehicle bugatti = new Vehicle("123", 4, 1050, "Bugatti");

        Map<Person, Vehicle> carHolders = new HashMap<>();

        carHolders.put(p1, bugatti);
        carHolders.put(p2, fiat);
        carHolders.put(p3, volvo);
        carHolders.put(p4, ferrari);

        System.out.println(carHolders.get(p3));
        System.out.println(carHolders.size());

    }
}
