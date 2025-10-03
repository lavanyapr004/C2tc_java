package com.tns.generic_class;

public class Exec1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<String> obj= new Generic();
		obj.setData("hello");
		System.out.println("the string object is:"+obj.getData());
		
		
		
		
		Generic<Integer> iobj= new Generic();
		iobj.setData(22);
		System.out.println("the string object is:"+iobj.getData());


	}

}
