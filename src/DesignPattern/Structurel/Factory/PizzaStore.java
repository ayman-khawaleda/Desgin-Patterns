package DesignPattern.Structurel.Factory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        var pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}
