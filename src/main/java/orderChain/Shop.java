package orderChain;

import pizza.Pizza;
import properties.Ingredient;

import java.util.Map;

public class Shop extends PizzaChain {

    private static final Map<Ingredient, Integer> ingredients = Map.of(
            Ingredient.CHEESE,1,
            Ingredient.TOMATO_SAUCE,1,
            Ingredient.PINEAPPLE,2,
            Ingredient.HAM,1,
            Ingredient.SPINACH, 2,
            Ingredient.PEPPERONI, 1);

    public Shop(PizzaChain next) {
        super(next);
    }


    @Override
    public boolean check(Pizza pizza) {
        for(Map.Entry<Ingredient, Integer> e : pizza.getIngredients().entrySet()){
            if(!ingredients.containsKey(e.getKey()) || ingredients.get(e.getKey())<e.getValue()) {
                System.out.println("There is not enough "+e.getKey()+" in a shop.");
                return false;
            }
        }
        if(getNext()==null) return true;
        else return getNext().check(pizza);
    }
}
