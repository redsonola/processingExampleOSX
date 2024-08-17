package com.processing_example;

import processing.core.*;

public class Main extends PApplet{
    public static void main(String[] args) {
        PApplet.main("com.processing_example.Main");
        System.out.println("Hello world!");
    }

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        background(0);
    }

    public void draw()
    {
        rectMode(CENTER);
        rect(width/2, height/2, 100, 100);
    }
}