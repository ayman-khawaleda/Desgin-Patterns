package DesignPattern.Structurel.Decorator;

public class DarkRoast extends Beverage{
    @Override
    public String getDescription() {
        return "DarkRoast\nAdd: ";
    }

    @Override
    public float getCost() {
        return 0.99f;
    }
}
