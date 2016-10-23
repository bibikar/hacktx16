package hacktx16.entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import hacktx16.map.Camera;
import hacktx16.map.Map;
import hacktx16.map.Platform;


public class Player extends Entity{
	
	Map map;
	
	int width = 25, height = 25;
	
	public Player(Map map, int lives, String name, int maxHealth, int damage, double xPos, double yPos, double xVel, double yVel){
		this.map = map;
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
		yVel += 0.1;
		Rectangle pRect = new Rectangle();
		pRect.setBounds((int) xPos, (int) yPos, (int) width, (int) height);
		System.out.println(map);
		for (Platform p : map.getPlatforms()) {
			Rectangle plRect = new Rectangle();
			plRect.setBounds((int) p.getX1(), (int) p.getY1(), (int) (p.getX2() - p.getX1()), 1);
			if (pRect.intersects(plRect)) yVel = 0;
		}
		xPos += xVel;
		yPos += yVel;
	}

	@Override
	public void draw(Graphics2D g, Camera c) {
	    g.setColor( Color.orange );
	    double[] pos = c.computeDisplayCoordinates(xPos, yPos);
	    double scale = c.getScale();
	    g.fillRect( (int) pos[0], (int) pos[1], (int) (width * scale), (int) (height * scale ));
		g.setColor(Color.black);
	}
	
	
	
	
}
