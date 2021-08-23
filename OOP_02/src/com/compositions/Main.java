package com.compositions;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220B","Dell","240", dimensions);
		
		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
		// if we don't need variable for a method, we can just type the method with new keyword and parameters.
		
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		thePC.getMonitor().drawPixelAt(1500,1200, "red");
		thePC.getMotherboard().loadProgram("Windows 1.0");
		thePC.getTheCase().pressPowerButton();
		
		
//		difference between inheritance : passing those constructors so we can form our PC
//		PC has a case, motherboard, and a monitor. -> this is the way when we're thinking of wheter to use inheritance or compositon.
		
		
		
	}

}

