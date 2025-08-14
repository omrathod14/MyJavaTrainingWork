package com.aurionpro.model;

import com.aurionpro.behavior.PlayWithFingers;
import com.aurionpro.behavior.StandardTune;

public class AcousticGuitar extends Guitar {
    public AcousticGuitar() {
        playBehavior = new PlayWithFingers();
        tuneBehavior = new StandardTune();
    }
    public void display() {
        System.out.println("I'm an Acoustic Guitar.");
    }
}