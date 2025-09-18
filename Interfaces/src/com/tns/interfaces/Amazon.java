package com.tns.interfaces;

public abstract class Amazon {
    static final int serviceCharge = 100;  // Constant service charge

    // Abstract method that subclasses must implement
    abstract void addcharge();

    // Regular method with a default implementation
    public void display() {
        System.out.println("Welcome to Amazon!");
    }
}
