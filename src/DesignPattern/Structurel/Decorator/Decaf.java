package DesignPattern.Structurel.Decorator;

public class Decaf extends Beverage{
    @Override
    public String getDescription() {
        return "Decaf\nAdd: ";
    }

    @Override
    public float getCost() {
        return 0.85f;
    }
}
