package DesignPattern.behavioral.StrategyPattern;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Swinging a Sword");
    }
}
