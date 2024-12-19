package data;

public class Motorbike extends Vehicle {
    private double seatStorage;

    public Motorbike(String brand, String color, int horsePower, double seatStorage) {
        super(brand, color, horsePower);
        this.seatStorage = seatStorage;
    }

    public double getSeatStorage() {
        return seatStorage;
    }

    @Override
    public void startEngine() {
        System.out.println("brrrrrrrrrrrrr");
    }
}
