package com.tns.lambdaexpressions;

import java.util.ArrayList;
	public class LambdaCollections {

		public static void main(String[] args) {
			ArrayList<Integer>al=new ArrayList<Integer>();
			al.add(2);
			al.add(3);
			al.add(4);
			al.add(8);
			
			al.forEach(ele->System.out.println(ele));
			// TODO Auto-generated method stub

		}

	}


