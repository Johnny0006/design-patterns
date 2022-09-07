import ingredient.Bacon;
import ingredient.Pepperoni;
import ingredient.Pineapple;
import pizza.Hawaiian;
import pizza.Margherita;
import properties.Pie;
import properties.PizzaSize;

public class Main {

    public static void main(String[] args){

        Margherita margherita = new Margherita(PizzaSize.SMALL, Pie.THICK);
        System.out.println(margherita.getDescription()+", cost: "+margherita.getCost());

        margherita = new Margherita(PizzaSize.MEDIUM, Pie.THIN);
        System.out.println(margherita.getDescription()+", cost: "+margherita.getCost());

        Pepperoni extraPepperoni = new Pepperoni(margherita);
        System.out.println(margherita.getDescription()+", cost: "+margherita.getCost());

        Hawaiian hawaiian = new Hawaiian(PizzaSize.LARGE, Pie.THICK);

        Bacon bacon = new Bacon(new Pineapple(hawaiian).getPizza());
        System.out.println(hawaiian.getDescription()+", cost: "+hawaiian.getCost());

    }

}
