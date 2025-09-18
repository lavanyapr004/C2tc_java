package com.tns.exceptionhandling;

public class Age extends Exception {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		Age(String str) {
	        super(str);  // Passes the error message to Exception
	    }

}
