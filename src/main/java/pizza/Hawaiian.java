package pizza;

import properties.Ingredient;
import properties.Pie;
import properties.PizzaSize;

import java.util.HashMap;
import java.util.Map;

public class Hawaiian extends Pizza {


    public Hawaiian(PizzaSize size, Pie pie) {
        super(size, pie, 13.0, "Pizza with pineapple and ham");
        this.setIngredients(Map.of(
                Ingredient.CHEESE,1,
                Ingredient.TOMATO_SAUCE,1,
                Ingredient.PINEAPPLE,2,
                Ingredient.HAM,1));
    }

}
