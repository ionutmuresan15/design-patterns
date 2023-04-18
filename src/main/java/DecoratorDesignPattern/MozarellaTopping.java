package DecoratorDesignPattern;
import FactoryDesignPattern.Pizza;

public class MozarellaTopping extends ToppingDecorator{

    public MozarellaTopping(Pizza newPizza) {

        super(newPizza);
    }

    public String showPizzaIngredients(){

        return tempPizza.showPizzaIngredients() + ", MOZARELLA (extra)";
    }

    public double getCost(){

        return tempPizza.getCost() + 0.50;
    }
}
