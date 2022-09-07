import orderChain.FlourSupply;
import orderChain.PizzaChain;
import orderChain.Shop;
import orderChain.Wallet;
import pizza.Pizza;
import properties.Ingredient;
import properties.Pie;
import properties.PizzaSize;

import java.util.Map;

public class Main {

    private static PizzaChain getChain() {
        return new Shop(new Wallet(new FlourSupply(null)));
    }

    public static void main(String[] args){

        Pizza pizza = new Pizza(
                PizzaSize.MEDIUM,
                Pie.THICK,
                Map.of(
                        Ingredient.PINEAPPLE,1,
                        Ingredient.CHEESE,1,
                        Ingredient.TOMATO_SAUCE,1
                )
        );

        Pizza pizza1 = new Pizza(
                PizzaSize.LARGE,
                Pie.THICK,
                Map.of(
                        Ingredient.PINEAPPLE,1,
                        Ingredient.CHEESE,1,
                        Ingredient.TOMATO_SAUCE,1
                )
        );

        Pizza pizza2 = new Pizza(
                PizzaSize.LARGE,
                Pie.THICK,
                Map.of(
                        Ingredient.CHEESE,1,
                        Ingredient.TOMATO_SAUCE,1,
                        Ingredient.PINEAPPLE,2,
                        Ingredient.HAM,1,
                        Ingredient.SPINACH, 2,
                        Ingredient.PEPPERONI, 1
                )
        );

        Pizza pizza3 = new Pizza(
                PizzaSize.LARGE,
                Pie.THICK,
                Map.of(
                        Ingredient.CHEESE,2,
                        Ingredient.TOMATO_SAUCE,1
                )
        );

        if(getChain().check(pizza)) System.out.println("You are able to make that pizza");
        if(getChain().check(pizza1)) System.out.println("You are able to make that pizza");
        if(getChain().check(pizza2)) System.out.println("You are able to make that pizza");
        if(getChain().check(pizza3)) System.out.println("You are able to make that pizza");


    }
}
