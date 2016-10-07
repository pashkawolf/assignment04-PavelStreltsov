package com.assignment04.superclasses;

/**
 * Superclass Human.
 *  
 * */
public class Human  {  // Superclass Human
	private String name = ""; //Defining variable String "name"
	private int age = 0;      // Variable age defined 
	
	/**
	 * Invoking objects with help of this. 
	 * */
	public Human(String name ,int age){ //Invoking objects with help of this.
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * Getter returns name.
	 *  
	 * */
	public String getName() { //Getter returns name.
		return name;
	}
	/**
	 * Setter invoking name.
	 *  
	 * */
	public void setName(String name) { //Setter invoking name.
		this.name = name;
	}
	/**
	 * Getter returns age.
	 *  
	 * */
	public int getAge() { //Getter returns age.
		return age;
	}
	/**
	 * Setter invoking age.
	 *  
	 * */
	public void setAge(int age) { //Setter invoking age.
		this.age = age;
	}
	

}
