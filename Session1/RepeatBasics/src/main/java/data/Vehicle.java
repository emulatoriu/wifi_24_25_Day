package data;

public class Vehicle {
    private String brand;
    private double km;
    private double miles;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
        this.miles = km /1.6;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
        this.km = miles * 1.6;
    }
}
