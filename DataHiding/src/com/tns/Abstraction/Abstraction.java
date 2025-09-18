package com.tns.Abstraction;

public abstract class Abstraction {
	protected float area;  // accessible to subclasses

    // abstract method to calculate area
    abstract void calculate();

    // concrete method to display area
    void display() {
        System.out.println("Area: " + area);
    }
}


