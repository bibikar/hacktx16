package hacktx16.entity;

import java.awt.Graphics2D;
import java.util.Random;

import hacktx16.map.Camera;

public class Monster extends Entity {
	
	public Monster(String name, int x, int y, int health, int maxHealth, int attack) {
		this.name = name;
		this.xPos = x;
		this.yPos = y;
		this.health = health;
		this.maxHealth = maxHealth;
		this.attack = attack;
	}

	@Override
	public void draw(Graphics2D g, Camera camera) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Calculates damage based on this Monster's entity damage value,
	 * using a Gaussian distribution.
	 */
	public int getDamage() {
		Random random = new Random();
		double mean = damage;
		double stdev = damage*0.1;
		return (int) (mean + random.nextGaussian() * stdev);
	}

	
	
}
