package DesignPattern;

import DesignPattern.behavioral.StrategyPattern.*;
import DesignPattern.behavioral.StrategyPattern.Character;

public class Main {

    public static void main(String[] args) {
        Character king = new King();
        king.setWeapon(new SwordBehavior());
        king.fight();
        Character queen = new Queen();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();
        king.setWeapon(new BowAndArrowBehavior());
        king.fight();
    }
}
