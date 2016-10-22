package hacktx16.entity;

import java.awt.Graphics2D;

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
	
	@Override
	public void tick() {
		//skip
		
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
