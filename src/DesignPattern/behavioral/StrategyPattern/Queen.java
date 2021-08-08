package DesignPattern.behavioral.StrategyPattern;

public class Queen extends Character{
    @Override
    public void fight() {
        System.out.println("Queen Fight");
        weapon.useWeapon();
    }
}
