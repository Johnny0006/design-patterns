package pizza;

import properties.Pie;
import properties.PizzaSize;

public class Margherita extends Pizza {

    public Margherita(PizzaSize size, Pie pie) {
        super(size, pie, 10.0, "Simple Margarita");
    }
}
