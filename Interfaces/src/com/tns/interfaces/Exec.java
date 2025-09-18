package com.tns.interfaces;

public class Exec {
    public static void main(String[] args) {
        // Create instances of NonPrimeuser and PrimeUser
        Amazon user1 = new NonPrimeuser();
        Amazon user2 = new PrimeUser();

        // Display the message and apply charges
        user1.display();
        user1.addcharge();

        user2.display();
        user2.addcharge();
    }
}
