package com.upskill.java_6;

public class Exception_TryCatchFinale {

	
	
	
	
	
	
	
	public static void main (String[] args){
		
		try{
		int[]  ageStarlord = new int []{25, 19, 21, 28, 35, 49, 55};
		System.out. println(ageStarlord[3]);
		
		}	catch (Exception e ){
			e.printStackTrace();
		}
		System.out. println("Array Completed !");
		
		try{
		int num = Integer . parseInt("2");
		System.out. println(num);
		} catch (NumberFormatException e){
			e.printStackTrace();	
		}
		System.out. println("parshing Completed !");
		try {
			throw new myException("2");
		}catch  (Exception e ){
			e.printStackTrace();
			System.out. println("User Defined Exception !");
		}
	
		finally {
			System.out. println("Test Execution Completed!");
		}
	}
	
}
