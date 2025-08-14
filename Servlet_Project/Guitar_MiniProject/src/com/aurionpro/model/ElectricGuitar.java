package com.aurionpro.model;

import com.aurionpro.behavior.DropDTune;
import com.aurionpro.behavior.PlayWithPick;

public class ElectricGuitar extends Guitar {
    public ElectricGuitar() {
        playBehavior = new PlayWithPick();
        tuneBehavior = new DropDTune();
    }
    public void display() {
        System.out.println("I'm an Electric Guitar.");
    }
}