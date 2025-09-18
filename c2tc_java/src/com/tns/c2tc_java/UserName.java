package com.tns.c2tc_java;
import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        // Taking string input
		        System.out.println("Enter your name:");
		        String n = input.nextLine();
		        System.out.println("Hello " + n);

		        // Taking integer input
		        System.out.println("Enter your roll number:");
		        if (input.hasNextInt()) {
		            int rollNo = input.nextInt();
		            System.out.println("The roll number is: " + rollNo);
		        } else {
		            System.out.println("Invalid input. Please enter an integer.");
		        }

		        input.close();
		    }
		

	}


