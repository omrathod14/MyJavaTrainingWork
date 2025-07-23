package com.aurionpro.model;

import com.aurionpro.behavior.PlayBehavior;
import com.aurionpro.behavior.TuneBehavior;

//superclass

public abstract class Guitar {
    PlayBehavior playBehavior;
    TuneBehavior tuneBehavior;

    public Guitar() {}

    public void performPlay() {
        playBehavior.play();
    }

    public void performTune() {
        tuneBehavior.tune();
    }

    public void setPlayBehavior(PlayBehavior pb) {
        playBehavior = pb;
    }

    public void setTuneBehavior(TuneBehavior tb) {
        tuneBehavior = tb;
    }

    public void clean() {
        System.out.println("Cleaning the guitar.");
    }

    public abstract void display();
}
