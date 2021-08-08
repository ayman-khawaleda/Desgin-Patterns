package DesignPattern.behavioral.StrategyPattern;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("chopping with an Axe");
    }
}
