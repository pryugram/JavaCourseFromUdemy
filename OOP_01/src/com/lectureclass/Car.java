package com.lectureclass;

public class Car {
	
	private int doors;	//state
	private int wheels;
	private String model;
	private String engine;	
	private String color;
	//creat a template of the part and parcel of a Car.
	//private : don't allow a class outside of 
    //			the Car class to access these variables.
	
	
	
	public void setModel(String model) {
//		to distinguish field and parameter
//		this - > to refer the filed of the class
//		if we 're to update or access this(model) field
//		use 'this'
		
//		this.model = model;	
//update the field behind 'this' with the contents of the parameter that was passed to me.
		
		String validModel = model.toLowerCase();
		
		
		if(validModel.equals("carrera") || validModel.equals("holden"))
		{
			this.model = model;
		}
		else
		{
			this.model = "Unknown";
		}
		
		
	}
	
	public String getModel() {
		return this.model;
		
	}
	
	
		
		
		
		
		

}

