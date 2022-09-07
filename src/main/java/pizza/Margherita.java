package pizza;

import properties.Ingredient;
import properties.Pie;
import properties.PizzaSize;

import java.util.Map;

public class Margherita extends Pizza {

    public Margherita(PizzaSize size, Pie pie) {
        super(size, pie, 10.0, "Simple Margarita");
        this.setIngredients(Map.of(
                Ingredient.CHEESE,1,
                Ingredient.TOMATO_SAUCE,1
        ));
    }

}
