package hacktx16.map;

import java.util.HashSet;
import java.util.Set;

import hacktx16.entity.Entity;

public class Map {

	// Coordinate system:
	// (0,0) at top left corner.
	
	double height, width;
	Set<Entity> entities;
	// Set<Platform> platforms;
	
	public Map(double height, double width) {
		entities = new HashSet<>();
		// platforms = new HashSet<>();
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
}
