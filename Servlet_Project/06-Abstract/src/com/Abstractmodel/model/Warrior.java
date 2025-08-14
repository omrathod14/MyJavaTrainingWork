package com.Abstractmodel.model;

public class Warrior extends Gamecharacter {
    public Warrior(String name, int powerLevel) {
        super(name, powerLevel);
    }

    public void attack() {
        powerLevel -= 10;
        System.out.println(name + " attacks! Power reduced by 10.");
    }
}

