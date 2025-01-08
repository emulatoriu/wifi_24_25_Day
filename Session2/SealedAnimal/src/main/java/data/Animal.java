package data;

public abstract class Animal {
    private String name;
    private boolean isMammal;
    private double weight;

    public Animal(String name, boolean isMammal, double weight) {
        this.name = name;
        this.isMammal = isMammal;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
