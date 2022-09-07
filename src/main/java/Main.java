import pizza.CustomPizza;
import pizza.Hawaiian;
import pizza.Margherita;
import pizzaBuilder.CustomPizzaBuilder;
import properties.Pie;
import properties.PizzaSize;

public class Main {

    public static void main(String[] args){

        CustomPizzaBuilder builder = new CustomPizzaBuilder();

        CustomPizza customPizza = builder
                .size(PizzaSize.SMALL)
                .pie(Pie.THIN)
                .cheese(1)
                .pepperoni(2)
                .tomatoSauce(1)
                .build();

        CustomPizza customPizza1 = builder
                .size(PizzaSize.MEDIUM)
                .pie(Pie.THICK)
                .cheese(2)
                .ham(3)
                .tomatoSauce(1)
                .pineapple(2)
                .build();

        System.out.println(customPizza);
        System.out.println(customPizza1);

    }

}
