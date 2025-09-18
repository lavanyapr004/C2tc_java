package com.tns.Abstraction;

public class Exec {
	public static void main(String[] args) {
        Abstraction d;
      
        // Using Circle
        d = new Circle(1.0f); // radius = 1
        System.out.println("Calculating area for Circle:");
        d.calculate();
        d.display();
    }
}


