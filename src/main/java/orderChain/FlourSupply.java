package orderChain;

import pizza.Pizza;

public class FlourSupply extends PizzaChain {

    private static final double flour = 2.7;

    public FlourSupply(PizzaChain next) {
        super(next);
    }

    @Override
    public boolean check(Pizza pizza) {

        if(pizza.getSize().getFlour()>flour){
            System.out.println("You don't have enough flour for this pizza (flour supply: " + flour + " flour needed: " + pizza.getSize().getFlour() + ")");
            return false;
        }

        if(getNext()==null) return true;
        else return getNext().check(pizza);
    }
}
