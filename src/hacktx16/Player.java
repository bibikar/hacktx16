package hacktx16;

import java.awt.Graphics2D;

import hacktx16.entity.Entity;

public class Player extends Entity{
	Player player = new Player();
	
	
	
	

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
