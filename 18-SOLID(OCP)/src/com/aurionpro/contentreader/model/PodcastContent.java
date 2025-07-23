package com.aurionpro.contentreader.model;

public class PodcastContent implements Content {
    @Override
    public void render() {
        System.out.println("Rendering podcast content...");
    }
}
