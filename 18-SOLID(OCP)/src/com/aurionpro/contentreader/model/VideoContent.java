package com.aurionpro.contentreader.model;

public class VideoContent implements Content {
    @Override
    public void render() {
        System.out.println("Rendering video content...");
    }
}
