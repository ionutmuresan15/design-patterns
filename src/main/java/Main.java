import DecoratorDesignPattern.BlackOlivesTopping;
import DecoratorDesignPattern.MozarellaTopping;
import DecoratorDesignPattern.MushroomsTopping;
import FactoryDesignPattern.*;

import static FactoryDesignPattern.PizzaEnum.*;

/*
    Application containing a pizza shop, where the client is able to choose the desired pizza
    and also adding a different topping on it.

    I used the Factory Design Pattern (Creational) in order to create the pizzas that the restaurant has,
    and the Decorator Design Pattern (Structural) in order to add the topping on an existing pizza.

    By using these two design patterns the application can be extended very easily, without needing to
    modify the existing classes.
    (For example if we have to add a new pizza in the shop we can create a newPizzaClass which implements the Pizza interface
    and if we want to add a new topping in our shop is enough to create a newToppingClass which extends ToppingDecorator abstract class)

*/

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza veggiePizza = new MozarellaTopping(pizzaFactory.getInstance(VEGGIE_PIZZA));
        Pizza pepperoniPizza = new MushroomsTopping(new MozarellaTopping(pizzaFactory.getInstance(PEPPERONI_PIZZA)));
        Pizza margheritaPizza = new BlackOlivesTopping(new MushroomsTopping(new MozarellaTopping(pizzaFactory.getInstance(MARGHERITA_PIZZA))));
        Pizza basicPepperoniPizza = pizzaFactory.getInstance(PEPPERONI_PIZZA);

        System.out.println("Ingredients for the veggie pizza that you ordered: "  + veggiePizza.showPizzaIngredients() + ".");
        System.out.println("The total cost for the veggie pizza that you ordered: " + veggiePizza.getCost() + "$");

        System.out.println("------------------------------------------------");

        System.out.println("Ingredients for the veggie pizza that you ordered: "  + pepperoniPizza.showPizzaIngredients() + ".");
        System.out.println("The total cost for the veggie pizza that you ordered: " + pepperoniPizza.getCost() + "$");

        System.out.println("------------------------------------------------");

        System.out.println("Ingredients for the margherita pizza that you ordered: "  + margheritaPizza.showPizzaIngredients() + ".");
        System.out.println("The total cost for the margherita pizza that you ordered: " + margheritaPizza.getCost() + "$");

        System.out.println("------------------------------------------------");

        System.out.println("Ingredients for the pepperoni pizza that you ordered: "  + basicPepperoniPizza.showPizzaIngredients() + ".");
        System.out.println("The total cost for the pepperoni pizza that you ordered: " + basicPepperoniPizza.getCost() + "$");
    }
}
