package com.upskill.java_4;

public class Encapsulation {



	private  String name  = "Upskill";
	
	private int ssn  = 123457689;
	
	private String username =  "Madan KC";
	
	public void setName(String value){
		name = value;
		
	}

	public String getName(){
		return name;
		
	}	
	
	public void setSSN(int value){
		ssn = value;
	}	
	public String getUserName(){
		return username;
	}


	// dob, dl,address
	private  String street  = "8625 Vanwyck";
	       
	private int dob  = 11/25/2080;
	
	private int dl =  987654321;
	
	
	public void setStreet(String value){
		street = value;
	}
	
	public String getStreet(){
		return street;
	}	
		public void setDOB(int value){
			dob= value;
		}		
			public int getDL(){
				return dl;
			}
		
	}
				
				
	
	
	
	
	

