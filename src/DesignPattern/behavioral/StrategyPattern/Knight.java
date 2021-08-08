package DesignPattern.behavioral.StrategyPattern;

public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println("Knight Fight");
        weapon.useWeapon();
    }
}
