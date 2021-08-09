package DesignPattern;


import DesignPattern.Structurel.Decorator.*;

public class Main {

    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Mocha mocha = new Mocha(espresso);
        Whip whip = new Whip(mocha);
        var specialOrder = new Whip(new Milk(new Mocha(new Decaf())));
        System.out.println(whip.getDescription()+"\nThe Cost: "+whip.getCost());
        System.out.println(specialOrder.getDescription()+"\nThe Cost: "+specialOrder.getCost());
    }
}
