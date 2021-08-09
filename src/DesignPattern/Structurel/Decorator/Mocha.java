package DesignPattern.Structurel.Decorator;

public class Mocha extends BeverageCondiment {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Mocha, ";
    }

    @Override
    public float getCost() {
        return super.getCost() + 0.25f;
    }
}
