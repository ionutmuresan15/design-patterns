package DecoratorDesignPattern;
import FactoryDesignPattern.Pizza;

public class BlackOlivesTopping extends ToppingDecorator{

    public BlackOlivesTopping(Pizza newPizza) {
        super(newPizza);
    }

    public String showPizzaIngredients(){

        return tempPizza.showPizzaIngredients() + ", BLACK OLIVES (extra)";
    }

    public double getCost(){

        return tempPizza.getCost() + 0.25;
    }

}
