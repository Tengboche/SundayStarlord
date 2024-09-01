package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {
	
	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;												//Variable
		int[] ageIronMan = new int[]{25, 30, 37, 21, 27, 32};		//Array
		
		//Array index			     [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Age : " + ageIronMan[3]);
		System.out.println("Total Student : " + ageIronMan.length);
		
		String[] nameIronMan = new String[]{"Yusuf", "Abdullah", "Madan","Sumaia","Jannatul"};
		
		System.out.println("Student Name : " + nameIronMan[2]);
		System.out.println("Total Student Name: " + nameIronMan.length);
		
		//Multi-Dimentional Array
		int [][] ageIronMan2D = {{25, 32, 37, 21, 27, 32},			//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
								 {26, 30, 33, 28}};					//[1][0] [1][1] [1][2] [1][3]
		
		System.out.println("Student Age 2D : " + ageIronMan2D[1][0]);
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Yusuf", 28);
		Student.put("Abdullah", 22);
		Student.put("Madan", 32);
		Student.put("Jannatul", 24);
		Student.put("Fahim", 23);
		
		System.out.println("HashMap Student Age : " + Student.get("Fahim"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("Ktm" , "Kathmandu");
		Capital.put("BD" , "Dhaka");
		Capital.put(null, "null key value");
		Capital.put(null, null);
		System.out.println("Capital City :" + Capital.get(null));
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD","Asia");
		Region.put("USA","North America");	
		
		System.out.println("Region  : " + Region.get("BD"));
		
		HashSet<String>  car = new HashSet<String>();
        car.add("BMW");
        car.add("Toyota");
        car.add("Riksha");
        car.add("Tesla");
        System.out.println("Car : " + car); 
        
	}
}