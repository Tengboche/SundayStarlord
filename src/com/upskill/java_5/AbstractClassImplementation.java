package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {

	@Override
	public void iDoor() {
		System.out.println("My Car has 4 door");
	}

	@Override
	public int iWheel() {
		System.out.println("My Car has 4 Wheel");
		return 4;
	}

	
	

	@Override
	public String iEngine() {
		
		return "10 HP";
	}
	
}