package com.tns.Entityclass;
import java.util.Scanner;

public class TrainerDemo {

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        Trainer[] trainers = new Trainer[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Enter details of Trainer " + (i + 1));

	            System.out.print("Enter ID: ");
	            int id = Integer.parseInt(sc.nextLine());

	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Designation: ");
	            String design = sc.nextLine();

	            System.out.print("Enter City: ");
	            String city = sc.nextLine();

	            trainers[i] = new Trainer(id, name, design, city);
	        }

	        System.out.println("\nTrainer Details:");
	        for (Trainer t : trainers) {
	            System.out.println(t);
	        }

	        sc.close();
	    }
	}


