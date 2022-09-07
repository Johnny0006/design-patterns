package ingredient;

import pizza.Pizza;
import pizzaDecorator.AddIngredient;
import properties.Pie;
import properties.PizzaSize;

public class Bacon extends AddIngredient {

    public Bacon(Pizza pizza) {
        super(pizza);
        pizza.setCost(pizza.getCost()+4.0);
        pizza.setDescription(pizza.getDescription()+" with extra bacon");
    }

}
