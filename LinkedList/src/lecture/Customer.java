package lecture;

public class Customer {
	private String name;
	private double balnce;
	public Customer(String name, double balnce) {
		this.name = name;
		this.balnce = balnce;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalnce() {
		return balnce;
	}
	public void setBalnce(double balnce) {
		this.balnce = balnce;
	}
}



//	once program stops executing, or goes out of scope in some way, 
//the variables are no longer needed -> Java's Garbage collection : goes through 
//automatically and freeze up the memory. 

//	actual string addresses don't need to be contiguous.