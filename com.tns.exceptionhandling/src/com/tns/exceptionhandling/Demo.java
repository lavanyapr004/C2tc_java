package com.tns.exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int d = 0;
				try
				{
					int a =42/d;	
				}
				
				catch(ArithmeticException e)
				{
					System.out.println("Exception handled" + e.getMessage());
					
				}
				
				finally {
				
				}
				System.out.println("Will not be printed");
				
				}

}
