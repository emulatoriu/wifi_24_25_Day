package data;

public non-sealed class Tiger extends Cat {
    private final String type;

    public Tiger(String name, boolean isMammal, double weight, String type) {
        super(name, isMammal, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
