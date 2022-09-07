package properties;

public enum PizzaSize {
    SMALL(1.0),
    MEDIUM(1.5),
    LARGE(2.0);

    private final double value;

    private PizzaSize(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
