package com.staticpractice.test;

public class Counter {
    static int value = 0;  

    public static void increment() {
        value++;
        System.out.println("Current counter value: " + value);
    }
}

