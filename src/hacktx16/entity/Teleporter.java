package hacktx16.entity;

import java.awt.Graphics;
import java.awt.Graphics2D;

import hacktx16.map.Camera;


public class Teleporter extends Entity {
	int width, height;
	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	public void Size(int width, int height){
		this.width=width;
		this.height=height;
	}
	public void TelePosition(int x_coor,int y_coor){
		xPos=x_coor;
		yPos=y_coor;
	}
	
	@Override
	public void draw(Graphics2D g, Camera c) {
		Teleporter port=new Teleporter();
		double[] pos = c.computeDisplayCoordinates(xPos, yPos);
		double scale = c.getScale();
		g.drawRect((int) pos[0],(int) pos[1],(int) (width * scale), (int) (height * scale));
		
	}
	
}
