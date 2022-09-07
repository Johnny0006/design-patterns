package ingredient;

import pizza.Pizza;
import pizzaDecorator.AddIngredient;

public class Pepperoni extends AddIngredient {

    public Pepperoni(Pizza pizza) {
        super(pizza);
        pizza.setCost(pizza.getCost()+3.0);
        pizza.setDescription(pizza.getDescription()+" with extra pepperoni");
    }
}
