package pizza;

import properties.Ingredient;
import properties.Pie;
import properties.PizzaSize;

import java.util.Map;

public class Pizza {
    private PizzaSize size;
    private Pie pie;
    private Map<Ingredient,Integer> ingredients;

    public Pizza(PizzaSize size, Pie pie, Map<Ingredient, Integer> ingredients) {
        this.size = size;
        this.pie = pie;
        this.ingredients = ingredients;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public Pie getPie() {
        return pie;
    }

    public void setPie(Pie pie) {
        this.pie = pie;
    }

    public Map<Ingredient, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<Ingredient, Integer> ingredients) {
        this.ingredients = ingredients;
    }

}
