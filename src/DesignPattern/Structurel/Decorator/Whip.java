package DesignPattern.Structurel.Decorator;

public class Whip extends BeverageCondiment {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Whip, ";
    }

    @Override
    public float getCost() {
        return super.getCost() + 0.35f;
    }
}
