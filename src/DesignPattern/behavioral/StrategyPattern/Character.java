package DesignPattern.behavioral.StrategyPattern;

public abstract class Character {
    WeaponBehavior weapon;

    public abstract void fight();
    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }
}
