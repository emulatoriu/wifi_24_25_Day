package data;

public abstract class Vehicle {
    private String brand;
    private String color;
    private int horsePower;

    public Vehicle(String brand, String color, int horsePower) {
        this.brand = brand;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public abstract void startEngine();
}
