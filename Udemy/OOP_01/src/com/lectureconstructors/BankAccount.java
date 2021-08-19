package com.lectureconstructors;

public class BankAccount {
	
	private int accountNumber;
	private int balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public void depositFunds(int depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance);
	}
	
	public void withdrawlFunds(int withdrawlAmount) {
		if(balance - withdrawlAmount < 0)
		{
			System.out.println("Only " + this.balance + " available. Withdrawal not processed");
		}
		else
		{
			this.balance -= balance;
			System.out.println("Withdrawl 0f " + withdrawlAmount + " processed. Remaining balance = " + this.balance);
		}
		
	}
	
	

}
