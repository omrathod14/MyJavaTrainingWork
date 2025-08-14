package com.Controllable.model;


public class TV implements Controllable {
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    public void setMode(String mode) {
        System.out.println("TV mode set to: " + mode);
    }

    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}

