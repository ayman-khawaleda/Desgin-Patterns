package DesignPattern.behavioral.StrategyPattern;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Cutting With a Knife");
    }
}
