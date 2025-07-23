package com.aurionpro.contentreader.model;

public class ArticleContent implements Content {
    @Override
    public void render() {
        System.out.println("Rendering article content...");
    }
}

