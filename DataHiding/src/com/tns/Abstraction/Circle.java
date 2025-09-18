package com.tns.Abstraction;

public class Circle extends Abstraction {
	protected float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    void calculate() {
        area = 3.14f * r * r; // calculate area of circle
    }

    @Override
    void display() {
        System.out.println("Area of the circle: " + area); // corrected message
    }

    @Override
    public String toString() {
        return "Circle [radius=" + r + "]";
    }
}


