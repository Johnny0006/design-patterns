package ingredient;

import pizza.Pizza;
import pizzaDecorator.AddIngredient;

public class Pineapple extends AddIngredient {

    public Pineapple(Pizza pizza) {
        super(pizza);
        pizza.setCost(pizza.getCost()+2.0);
        pizza.setDescription(pizza.getDescription()+" with extra pineapple");
    }

}
