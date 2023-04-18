package FactoryDesignPattern;

public class MargheritaPizza implements Pizza{

    @Override
    public String showPizzaIngredients() {

        return "tomatoes, mozzarella cheese, garlic, fresh basil";
    }

    @Override
    public double getCost() {

        return 6.00;
    }
}
