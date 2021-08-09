package DesignPattern;


import DesignPattern.Structurel.Factory.ChicagoPizzaStore;
import DesignPattern.Structurel.Factory.NYPizzaStore;
import DesignPattern.Structurel.Factory.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        var nyPizza = nyPizzaStore.orderPizza("cheese");
        nyPizza.printDescription();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        var chicagoPizza = chicagoPizzaStore.orderPizza("veggie");
        chicagoPizza.printDescription();
    }
}
