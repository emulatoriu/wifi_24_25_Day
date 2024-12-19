import data.Car;
import data.Motorbike;
import data.Vehicle;

public class Application {
    public static void main(String[] args) {
        Vehicle m = new Motorbike("Harley", "black", 120, 10);
        System.out.println(m.getBrand());

        if(m instanceof Motorbike castedM) { // Pattern Matching
            //Motorbike castedM = (Motorbike) m;
            System.out.println(castedM.getSeatStorage());
        }
    }
}
