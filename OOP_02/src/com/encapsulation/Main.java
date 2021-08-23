package com.encapsulation;

public class Main {
	
	public static void main(String[] args) {
		
//		Player player = new Player();
//		player.name = "Tim";					//trying to access directly to the field.
//		player.health = 20;
//		player.weapon = "sword";
//		
//		int damage = 10;
//		player.loseHealth((damage));
//		System.out.println("Reamaining health = " + player.healthRemaining());
//		
//		damage = 11;
//		player.health = 200;				// One Problem : Player class is able to change those fields directly.
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//		
		
		
		EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
		System.out.println("Initial health is " + player.getHealth());
		
		
	}
}
