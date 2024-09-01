package com.upskill.java_4;


import com.upskill.java_1.MethodType; 

public class Polymorphism extends MethodType{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car ("seat 6");
		
		Polymorphism obj = new Polymorphism ();
		obj.annualIncomeVoid();

	}
		
		public void  annualIncomeVoid(){
		int calculateAnnualIncome = new AnnualIncome();
		
		}
	
		
		
	public static void car(){
	System.out.println("My Car is Tesla");
		
	}	
		
	public static  void car(String color){
		System.out.println("My Car is : " + color);

	}
	public static void car(int seat){
		System.out.println("My Car has : " + seat);
		
	}
	
	public static void car(boolean ev){
		System.out.println("My Car is EV = + ev");
		
	}
	
	public static void car(String color, int seat){
		System.out.println("My Car is : " + color + " . It has Seat : " + seat);
	}	
}
 