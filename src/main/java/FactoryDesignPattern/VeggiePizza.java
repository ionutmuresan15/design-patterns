package FactoryDesignPattern;

public class VeggiePizza implements Pizza{

    @Override
    public String showPizzaIngredients() {

        return "green pepper, red onion, tomatoes, olives";
    }

    @Override
    public double getCost() {

        return 5.00;
    }
}
