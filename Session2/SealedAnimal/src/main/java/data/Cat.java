package data;

public sealed class Cat extends Animal permits Tiger, Lion {
    public Cat(String name, boolean isMammal, double weight) {
        super(name, isMammal, weight);
    }
}
