package DesignPattern.Structurel.Factory;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        name = "NY Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marina Sauce";
        System.out.println("NYCheesePIZZA");
    }

    @Override
    public void cut() {
        System.out.println("    Cut Into square Slices");
    }
}
