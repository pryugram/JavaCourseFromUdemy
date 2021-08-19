package com.lectureclass;

public class Main {
	
	public static void main(String[] args) {
		Car porsche1;	//creat an object of Car class
		Car porsche = new Car();	//initialize
//		unlike data types, there isn't default values with classes -> compile error
//		that's why I need to initialize with new keyword.
		
//		another case : more less forcing it to crash
//		if it has null value
		
//		NullPointException : it hasn't been initialized
//		->  we haven't created an object from the template(class)
		
		Car holden = new Car();
		
		System.out.println("Model is " + porsche.getModel());
		// it returns null
		// because null is the eternal default state for a class and a string
		
		porsche.setModel("Carrera");
		System.out.println("Model is " + porsche.getModel());
		
		
		
	}

}
