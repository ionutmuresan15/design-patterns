package FactoryDesignPattern;

public class NotFoundPizza implements Pizza{

    @Override
    public String showPizzaIngredients() {

        return "The pizza that you are looking for is not in our menu at the moment.";
    }

    @Override
    public double getCost() {

        return 0.00;
    }
}
