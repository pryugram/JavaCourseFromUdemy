package com.lectureconstructors;

public class Main {
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		
		ba.setAccountNumber(12345);
		ba.setBalance(0);
		ba.setCustomerName("Bob");
		ba.setEmail("myemail@bob.com");
		ba.setPhoneNumber(01051142543);
		
		
		
		ba.withdrawlFunds(100);
		ba.depositFunds(50);

		ba.withdrawlFunds(100);
		
		ba.depositFunds(51);
		ba.withdrawlFunds(100);
		
	}

}
