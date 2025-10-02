package com.tns.lambdaexpressions;

public class WithoutParameter {
	public static void main(String[] args) {
		
		Cube c= (a)->{return a*a*a;};
		System.out.println(c.cal(5));
		}

}
