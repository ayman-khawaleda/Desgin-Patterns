package DesignPattern.Structurel.Factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new ChicagoCheesePizza();
        else if (type.equals("clam"))
            return new ChicagoClamPizza();
        else if (type.equals("veggie"))
            return new ChicagoVeggiePizza();
        else return null;
    }
}
