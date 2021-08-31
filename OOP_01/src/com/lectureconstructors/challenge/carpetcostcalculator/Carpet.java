package com.lectureconstructors.challenge.carpetcostcalculator;

public class Carpet {
	
	private double cost;

	public Carpet(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		if(cost < 0)
		{
			return cost = 0;
		}
		else
		{
			return cost;
		}
	}



	

	
	

}
