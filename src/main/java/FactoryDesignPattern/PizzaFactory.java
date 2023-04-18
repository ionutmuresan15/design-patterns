package FactoryDesignPattern;

public class PizzaFactory {

    public Pizza getInstance(String pizzaName){
        if(pizzaName.equals("VeggiePizza")){
            return new VeggiePizza();
        }
        else if(pizzaName.equals("PepperoniPizza")){
            return new PepperoniPizza();
        }
        else if(pizzaName.equals("MargheritaPizza")){
            return new MargheritaPizza();
        }
        return new NotFoundPizza();
    }
}
