package DecoratorDesignPattern;
import FactoryDesignPattern.Pizza;

abstract public class ToppingDecorator implements Pizza{

    public Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza){

        this.tempPizza = newPizza;
    }

    public String showPizzaIngredients(){

        return tempPizza.showPizzaIngredients();
    }

    public double getCost(){

        return tempPizza.getCost();
    }
}
