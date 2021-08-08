package DesignPattern.behavioral.StrategyPattern;

public class Troll extends Character{
    @Override
    public void fight() {
        System.out.println("Troll Fight");
        weapon.useWeapon();
    }
}
