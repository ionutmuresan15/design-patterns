package FactoryDesignPattern;

public class PizzaFactory {

    public Pizza getInstance(PizzaEnum pizzaName){
        if(pizzaName.equals(PizzaEnum.VEGGIE_PIZZA)){
            return new VeggiePizza();
        }
        else if(pizzaName.equals(PizzaEnum.PEPPERONI_PIZZA)){
            return new PepperoniPizza();
        }
        else if(pizzaName.equals(PizzaEnum.MARGHERITA_PIZZA)){
            return new MargheritaPizza();
        }
        return new NotFoundPizza();
    }
}
