package com.tns.generic;

public class Exec {
	public static void main(String[] args) {
		
		GenricProgram<String> obj= new GenricProgram();
		obj.setData("hello");
		System.out.println("the string object is:"+obj.getData());
		
		
		
		
		GenricProgram<Integer> iobj= new GenricProgram();
		iobj.setData(22);
		System.out.println("the string object is:"+iobj.getData());


	}

}
