package com.upskill.java_5;

public  class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		// TODO Auto-generated method stub
		System.out.println("My car has 4 door");
	}

	@Override
	public void iDoor(int door) {
		// TODO Auto-generated method stu
		System.out.println("My car has door :  + door");
		
	}

	@Override
	public void iDoor(String glass) {
		// TODO Auto-generated method stub
		System.out.println("My car has 4 door " + glass);
	}

	@Override
	public String iEngine() {
		// TODO Auto-generated method stub
		return "10HP";
	}

	@Override
	public int iWheel() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	

}
