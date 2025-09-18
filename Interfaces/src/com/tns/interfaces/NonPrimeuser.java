package com.tns.interfaces;

public class NonPrimeuser extends Amazon {
    @Override
    public void addcharge() {
        // Non-Prime users are charged the regular service charge
        System.out.println("Service charge applied for Non-Prime user: " + serviceCharge);
    }

    // Optionally override display() if you want custom behavior
    @Override
    public void display() {
        System.out.println("Welcome, Non-Prime User!");
    }
}
