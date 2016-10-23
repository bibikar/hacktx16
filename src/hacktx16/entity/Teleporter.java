package hacktx16.entity;

import java.awt.Graphics;
import java.awt.Graphics2D;

import hacktx16.map.Camera;


public class Teleporter extends Entity {
	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	public void Size(int width, int height){
		health=width;
		maxHealth=height;
	}
	public void TelePosition(int x_coor,int y_coor){
		xPos=x_coor;
		yPos=y_coor;
	}
	
	@Override
	public void draw(Graphics2D g, Camera camera) {
		Teleporter port=new Teleporter();
		g.drawRect((int)port.xPos,(int)port.yPos,(int)port.health, (int)port.maxHealth);
		
	}
	
}
