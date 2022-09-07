package pizzaBuilder;

import pizza.Pizza;
import properties.Pie;
import properties.PizzaSize;

public interface PizzaBuilder {

    public PizzaBuilder size(PizzaSize size);

    public PizzaBuilder pie(Pie pie);

    public Pizza build();

}
