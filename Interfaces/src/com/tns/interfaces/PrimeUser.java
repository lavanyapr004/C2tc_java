package com.tns.interfaces;

public class PrimeUser extends Amazon {
    @Override
    public void addcharge() {
        // Prime users get no service charge
        System.out.println("No service charge for Prime members.");
    }

    // Override the display method to customize the message for Prime users
    @Override
    public void display() {
        System.out.println("Welcome, Prime User!");
    }
}
