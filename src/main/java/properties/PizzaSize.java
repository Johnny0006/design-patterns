package properties;

public enum PizzaSize {
    SMALL(1.0, 2.0),
    MEDIUM(1.5, 2.7),
    LARGE(2.0, 3.1);

    private final double value;
    private final double flour;

    private PizzaSize(double value, double flour) {
        this.value = value;
        this.flour = flour;
    }

    public double getValue() {
        return value;
    }

    public double getFlour(){return flour;}
}
