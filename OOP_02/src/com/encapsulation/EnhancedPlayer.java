package com.encapsulation;

public class EnhancedPlayer {
	private String nmae;
	private int health = 100;
	private String weapon;
	
//	Encapsulation : making fields private, making sure that class or fields wihtin the 
//	class are not accessible to any classes that are outside
	
	
	public EnhancedPlayer(String nmae, int health, String weapon) {
		this.nmae = nmae;
		if(health > 0 && health <= 100)
		{
			this.health = health;
		}
		
		this.weapon = weapon;
	}
	
	public void loseHealth(int damage) {
		this.health = this.health - damage;
		if(this.health <= 0)
		{
			System.out.println("Player knocked out");	//reduce number of lives remaining for the player
		}
		
	}

	public int getHealth() {
		return health;
	}
	
	
	
	
	
}
