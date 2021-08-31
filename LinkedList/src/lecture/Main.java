package lecture;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer("Tim", 54.96);
		Customer anotherCustomer;
		anotherCustomer = customer;		
//assining another customer instance to point to the first instance.	
//		= saved the memory address != create a separate class
		anotherCustomer.setBalnce(12.18);
// two instances are sharing a same memory address, so this method has updated the value
		System.out.println("Balance for customer" + customer.getName() + " is " + customer.getBalnce());
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(3);
		intList.add(4);
		
		for(int i = 0; i < intList.size(); i++)
		{
			System.out.println(i + " : " + intList.get(i));
		}
		
		intList.add(1, 2);		
		// insert 2 to index position 1 -> put the actual number
		
		System.out.println("=======================================");
		for(int i = 0; i < intList.size(); i++)
		{
			System.out.println(i + " : " + intList.get(i));
		}
		
//Linked list : Each element in the list actually holds a link to the item 
//that follows it, as well as the actual value I'm wanting to actually store as well.
		
// Java have implemented the link list as a double link list : it stores 
//a reference to the previous item as well as a link, a reference to the entry 
//		that's next as well.
		
	}

}
