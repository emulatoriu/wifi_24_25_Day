package data;

public class Car extends Vehicle {
    private int amountSeats;

    public Car(String brand, String color, int horsePower, int amountSeats) {
        super(brand, color, horsePower);
        this.amountSeats = amountSeats;
    }

    public int getAmountSeats() {
        return amountSeats;
    }

    public void setAmountSeats(int amountSeats) {
        this.amountSeats = amountSeats;
    }

    @Override
    public void startEngine() {
        System.out.println("Woooooooam");
    }
}
