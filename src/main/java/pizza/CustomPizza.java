package pizza;

import properties.Ingredient;
import properties.Pie;
import properties.PizzaSize;



public class CustomPizza extends Pizza {

    public CustomPizza(PizzaSize size, Pie pie, double cost) {
        super(size, pie, cost, "Custom Pizza");
    }

    @Override
    public String toString() {
        return this.getDescription() + " cost: " + this.getCost()
                + "\ningredients:" + this.getIngredients();
    }
}
