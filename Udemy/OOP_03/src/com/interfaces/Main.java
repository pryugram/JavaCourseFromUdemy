package com.interfaces;

public class Main {
	
	public static void main(String[] args) {


		ITelephone ryusPhone;
		ryusPhone = new DeskPhone(123456);
		ryusPhone.powerOn();
		ryusPhone.callPhone(123456);
		ryusPhone.answer();
		
		ryusPhone = new MobilePhone(23456);
		ryusPhone.powerOn();
		ryusPhone.callPhone(23456);
		ryusPhone.answer();
		
		
		

    }

}
