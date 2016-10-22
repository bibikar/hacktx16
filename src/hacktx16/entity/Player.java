package hacktx16.entity;

import java.awt.Graphics2D;

<<<<<<< HEAD
public class Player extends Entity{
	public Player() {
		
	}
	
	void cHealth(int hp){
		setHealth(100);
	}
	
	void damageTaken(int dmg){
		setHealth(getHealth() - dmg);
	}
	void speed(int spd){
		setxVel(spd);
	}
=======

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
		
		
	}
	public int attack(){
		return (int) (Math.random()*((damage+2)-(damage-2)) + (damage-2));
	}
	
	void cHealth(int hp){
		setMaxHealth(100);
	}
	
	public void damageTaken(Entity monster){
		
		int attackValue = monster.getDamage();
		
		
		
		
	}
	void speed(int spd){
		setxVel(spd);
	}
	
>>>>>>> refs/remotes/origin/master
	
	@Override
	public void tick() {
		//skip
		
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
