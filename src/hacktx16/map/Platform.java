package hacktx16.map;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Platform extends Line2D {
	
	int x, y, x2, y2;
	
	public Platform() {
		
	}
	
	public Platform(int x, int y, int x2, int y2) {
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
	}		
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setX2(int x2) {
		this.x2 = x2;
	}
	
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	public void init() {
		Platform platform = new Platform(0,0,10,10);
		
		Platform platform2 = new Platform();
		platform2.setX(0);
		platform2.setY(0);
		platform2.setX2(10);
		platform2.setY2(10);
	}
	
	public void draw(Graphics g, Camera camera) {
		Graphics2D g2 = (Graphics2D)g;
		double[] pos1 = camera.computeDisplayCoordinates(x, y);
		double[] pos2 = camera.computeDisplayCoordinates(x2, y2);
		g2.setStroke(new BasicStroke(3));
		g2.drawLine((int)pos1[0], (int)pos1[1], (int)pos2[0], (int)pos2[1]);
	}

	@Override
	public Rectangle2D getBounds2D() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point2D getP1() {
		// TODO Auto-generated method stub
		return new Point(x,y);
	}

	@Override
	public Point2D getP2() {
		// TODO Auto-generated method stub
		return new Point(x2,y2);
	}

	@Override
	public double getX1() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getX2() {
		// TODO Auto-generated method stub
		return x2;
	}

	@Override
	public double getY1() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public double getY2() {
		// TODO Auto-generated method stub
		return y2;
	}

	@Override
	public void setLine(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		
	}
	
	public void PlatformPic(){
		BufferedImage image = null;{
			try {
				image = ImageIO.read(new URL("http://imgur.com/a/INFT8"));
			} catch (IOException e) {
				System.out.println("WRONG PLATFORM");		
			}}
		}
	
}
