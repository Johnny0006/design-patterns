package pizza;

import properties.Pie;
import properties.PizzaSize;

public class Hawaiian extends Pizza {

    public Hawaiian(PizzaSize size, Pie pie) {
        super(size, pie, 13.0, "Pizza with pineapple and ham");
    }

}
