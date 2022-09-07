package orderChain;

import pizza.Pizza;

public abstract class PizzaChain {
    private PizzaChain next;

    public abstract boolean check(Pizza pizza);

    public PizzaChain(PizzaChain next) {
        this.next = next;
    }

    public PizzaChain getNext() {
        return next;
    }

    public void setNext(PizzaChain next) {
        this.next = next;
    }
}
