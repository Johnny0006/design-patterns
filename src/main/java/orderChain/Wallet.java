package orderChain;

import pizza.Pizza;
import properties.Ingredient;

import java.util.Map;

public class Wallet extends PizzaChain {

    private static final double money = 14.5;

    public Wallet(PizzaChain next) {
        super(next);
    }


    @Override
    public boolean check(Pizza pizza) {

        double cost = 0.0;

        for (Map.Entry<Ingredient, Integer> e : pizza.getIngredients().entrySet()) {
            cost += e.getValue() * e.getKey().getValue();
        }

        if (cost > money) {
            System.out.println("You don't have enough money for this pizza (wallet: " + money + " cost: " + cost + ")");
            return false;
        }
        if (getNext() == null) return true;
        else return getNext().check(pizza);

    }
}
