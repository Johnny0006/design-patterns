package properties;

public enum Ingredient {
    CHEESE(2.0), TOMATO_SAUCE(2.0), PINEAPPLE(2.5), HAM(3.0), PEPPERONI(3.0), SPINACH(1.5), MUSHROOMS(1.5);

    private final double value;

    private Ingredient(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
