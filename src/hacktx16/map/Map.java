package hacktx16.map;

import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.Set;

import hacktx16.Platform;
import hacktx16.entity.Entity;

public class Map {

	// Coordinate system:
	// (0,0) at top left corner.
	
	double height, width;
	Set<Entity> entities;
	Set<Platform> platforms;
	
	public Map(double height, double width) {
		entities = new HashSet<>();
		platforms = new HashSet<>();
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public Set<Entity> getEntities() {
		return entities;
	}
	
	public boolean addEntity(Entity e) {
		return getEntities().add(e);
	}
	
	public Set<Platform> getPlatforms() {
		return platforms;
	}
	
	public boolean addPlatform(Platform p) {
		return getPlatforms().add(p);
	}
	
	public void tickAll() {
		for (Entity e : getEntities())
			e.tick();
	}
	
	public void draw(Graphics2D g) {
		for (Platform p : getPlatforms())
			p.draw(g);
		for (Entity e : getEntities())
			e.draw(g);
	}
	
}
