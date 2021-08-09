package DesignPattern.Structurel.Decorator;

public class Milk extends BeverageCondiment {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Milk, ";
    }

    @Override
    public float getCost() {
        return super.getCost()+0.20f;
    }
}
