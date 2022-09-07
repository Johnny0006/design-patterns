package pizzaDecorator;

import pizza.Pizza;
import properties.Pie;
import properties.PizzaSize;

public abstract class AddIngredient extends Pizza{
    protected Pizza pizza;

    public AddIngredient(Pizza pizza) {
        super(pizza.getSize(), pizza.getPie(), pizza.getCost(), pizza.getDescription());
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }
}
