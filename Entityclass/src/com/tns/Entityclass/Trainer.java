package com.tns.Entityclass;

public class Trainer {
	 int eid;
	    String ename;
	    String designation;
	    String city;

	    Trainer(int eid, String ename, String designation, String city) {
	        this.eid = eid;
	        this.ename = ename;
	        this.designation = designation;
	        this.city = city;
	    }

	    @Override
	    public String toString() {
	        return eid + " / " + ename + " / " + designation + " / " + city;
	    }
	
}
