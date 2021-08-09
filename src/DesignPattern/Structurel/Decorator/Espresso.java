package DesignPattern.Structurel.Decorator;

public class Espresso extends Beverage{
    @Override
    public String getDescription() {
        return "Espresso\nAdd: ";
    }

    @Override
    public float getCost() {
        return 0.75f;
    }
}
