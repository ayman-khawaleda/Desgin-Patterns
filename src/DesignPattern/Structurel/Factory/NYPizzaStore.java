package DesignPattern.Structurel.Factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new NYCheesePizza();
        else if (type.equals("clam"))
            return new NYClamPizza();
        else if (type.equals("veggie"))
            return new NYVeggiePizza();
        else return null;
    }
}
