package DecoratorDesignPattern;
import FactoryDesignPattern.Pizza;

public class MushroomsTopping extends ToppingDecorator{

    public MushroomsTopping(Pizza newPizza) {

        super(newPizza);
    }

    public String showPizzaIngredients(){

        return tempPizza.showPizzaIngredients() + ", MUSHROOMS (extra)";
    }

    public double getCost(){

        return tempPizza.getCost() + 0.75;
    }
}
