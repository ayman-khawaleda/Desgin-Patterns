package DesignPattern.Structurel.Decorator;

public class BeverageCondiment extends Beverage {
    Beverage beverage;

    public BeverageCondiment(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }

    @Override
    public float getCost() {
        return this.beverage.getCost();
    }
}
