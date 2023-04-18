package FactoryDesignPattern;

public class PepperoniPizza implements Pizza{

    @Override
    public String showPizzaIngredients() {

        return "mozzarella cheese, pepperoni";
    }

    @Override
    public double getCost() {

        return 7.00;
    }
}
