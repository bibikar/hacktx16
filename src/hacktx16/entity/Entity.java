package hacktx16.entity;

import java.awt.Graphics2D;

public abstract class Entity {
	
	int health, maxHealth;
	int damage;
	int lives;
	
	int attack;
	double xPos, yPos;
	double xVel, yVel;
	
	public abstract void draw(Graphics2D g);
		
	
	public abstract void tick();
		// assuming constant N ticks/second
	
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {	
		this.lives = lives;
	}

	public double getxPos() {
		return xPos;
	}

	public void setxPos(double xPos) {
		this.xPos = xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public void setyPos(double yPos) {
		this.yPos = yPos;
	}

	public double getxVel() {
		return xVel;
	}

	public void setxVel(double xVel) {
		this.xVel = xVel;
	}

	public double getyVel() {
		return yVel;
	}

	public void setyVel(double yVel) {
		this.yVel = yVel;
	}


	
}
