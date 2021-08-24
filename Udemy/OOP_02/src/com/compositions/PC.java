package com.compositions;

public class PC {

	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	public Case getTheCase() {
		return theCase;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public Motherboard getMotherboard() {
		return motherboard;
	}
	
	
/*
 * obvious advantage to use composition
 * if we use inherit, we can only, in Java, inherit from one class at a time.
 * 
 * In this case, PC Class comprises three other classes,
 * PC will have object case, monitor, and motherboard;
 * 
 * 
 * 
 */
	
	
}



