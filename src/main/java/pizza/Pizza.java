package pizza;

import properties.Ingredient;
import properties.Pie;
import properties.PizzaSize;

import java.util.Map;

public abstract class Pizza {
    private PizzaSize size;
    private Pie pie;
    private double cost;
    private String description;
    private Map<Ingredient, Integer> ingredients;

    public Pizza(PizzaSize size, Pie pie, double cost, String description) {
        this.size = size;
        this.pie = pie;
        this.cost = cost*size.getValue();
        this.description = description;
    }

    public Pizza(){}

    public PizzaSize getSize() {
        return size;
    }

    public Pie getPie() {
        return pie;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setPie(Pie pie) {
        this.pie = pie;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<Ingredient, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<Ingredient, Integer> ingredients) {
        this.ingredients = ingredients;
    }
}
