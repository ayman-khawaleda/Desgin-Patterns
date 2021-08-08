package DesignPattern.behavioral.StrategyPattern;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Throwing An Arrow With A Bow");
    }
}
