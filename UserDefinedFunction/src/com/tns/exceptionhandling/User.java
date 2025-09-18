package com.tns.exceptionhandling;
import java.util.Scanner;
public class User {
	private static int age;

    // Method that validates the age
    static void validate() throws Age {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Age: ");
            age = sc.nextInt();

            if (age < 18)
                throw new Age("Invalid Age");
            else
                System.out.println("Valid age");
        }
    }

}
