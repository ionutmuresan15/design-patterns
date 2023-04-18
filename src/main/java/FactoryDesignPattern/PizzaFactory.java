package FactoryDesignPattern;

import static FactoryDesignPattern.PizzaEnum.*;

public class PizzaFactory {

    public Pizza getInstance(PizzaEnum pizzaName){
        if(pizzaName.equals(VEGGIE_PIZZA)){
            return new VeggiePizza();
        }
        else if(pizzaName.equals(PEPPERONI_PIZZA)){
            return new PepperoniPizza();
        }
        else if(pizzaName.equals(MARGHERITA_PIZZA)){
            return new MargheritaPizza();
        }
        return new NotFoundPizza();
    }
}
