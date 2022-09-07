package pizzaBuilder;

import pizza.CustomPizza;
import pizza.Pizza;
import properties.Ingredient;
import properties.Pie;
import properties.PizzaSize;

import java.util.HashMap;
import java.util.Map;

public class CustomPizzaBuilder implements PizzaBuilder{

    private PizzaSize size;
    private Pie pie;
    private Map<Ingredient, Integer> ingredients = new HashMap<>();

    @Override
    public CustomPizzaBuilder size(PizzaSize size){
        this.size=size;
        return this;
    }

    @Override
    public CustomPizzaBuilder pie(Pie pie){
        this.pie = pie;
        return this;
    }

    public CustomPizzaBuilder cheese(int cheese){
        this.ingredients.put(Ingredient.CHEESE,cheese);
        return this;
    }

    public CustomPizzaBuilder tomatoSauce(int tomatoSauce){
        this.ingredients.put(Ingredient.TOMATO_SAUCE, tomatoSauce);
        return this;
    }

    public CustomPizzaBuilder pineapple(int pineapple){
        this.ingredients.put(Ingredient.PINEAPPLE, pineapple);
        return this;
    }

    public CustomPizzaBuilder ham(int ham){
        this.ingredients.put(Ingredient.HAM,ham);
        return this;
    }

    public CustomPizzaBuilder pepperoni(int pepperoni){
        this.ingredients.put(Ingredient.PEPPERONI, pepperoni);
        return this;
    }

    public CustomPizzaBuilder spinach(int spinach){
        this.ingredients.put(Ingredient.SPINACH,spinach);
        return this;
    }

    public CustomPizzaBuilder mushrooms(int mushrooms){
        this.ingredients.put(Ingredient.MUSHROOMS, mushrooms);
        return this;
    }

    @Override
    public CustomPizza build() {

        if(this.size == null){
            throw new IllegalArgumentException("Please select valid size");
        }else  if(pie == null){
            throw new IllegalArgumentException("Please select valid pie");
        }

        double price=5.0;

        for(Map.Entry<Ingredient,Integer> i : this.ingredients.entrySet()){
            price+=i.getValue()*i.getKey().getValue();
        }

        price*=this.size.getValue();

        CustomPizza pizza = new CustomPizza(this.size, this.pie, price);
        pizza.setIngredients(new HashMap<>(this.ingredients));

        return pizza;
    }
}
