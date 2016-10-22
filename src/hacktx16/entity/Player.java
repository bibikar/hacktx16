package hacktx16.entity;

import java.awt.Graphics2D;


public class Player extends Entity{
	public Player(int lives, String name, int maxHealth, int damage, double xPos, double yPos, double xVel, double yVel){
		this.lives = lives;
		this.name = name;
		this.maxHealth = maxHealth;
		this.damage = damage;
		this.xPos = xPos;
		this.yPos = yPos;
		this.xVel = xVel;
		this.yVel = yVel;
		this.health = maxHealth;
	}
	public int attack(){
		return (int) (Math.random()*((damage+2)-(damage-2)) + (damage-2));
	}

	public void damageTaken(Entity monster){
		
		int attackValue = monster.getDamage();
		if (health > attackValue)
			health = health - attackValue;
		else
			health = 0;
		if (health == 0){
			lives --;
			System.out.println("you dead");	
		}
	}
	
	@Override
	public void tick() {
		//skip
		
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
