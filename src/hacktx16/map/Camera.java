package hacktx16.map;

public class Camera {

	double x, y; // in absolute coordinates
	double xLength, yLength; // these are in absolute coordinates
	double scale;
	Map map;
	
	public Camera(double x, double y, double xLength, double yLength) {
		this.x = x;
		this.y = y;
		this.xLength = xLength;
		this.yLength = yLength;
		scale = 1.0;
	}
	
	/**
	 * Input absolute coordinates and get display coordinates
	 * @param x - absolute X coordinate
	 * @param y - absolute Y coordinate
	 * @return display coordinates
	 */
	public double[] computeDisplayCoordinates(double x, double y) {
		x -= this.x;
		y -= this.y;
		return new double[] {x * scale, y*scale};
	}
	
	public double[] getLocation() {
		return new double[] {x, y};
	}
	
	public boolean withinView(double x, double y) {
		if (x < this.x || x > this.x + xLength) return false;
		if (y < this.y || y > this.y + yLength) return false;
		return true;
	}
	
	public void moveTo(double x, double y) {

		System.out.printf("Map dims (%f, %f)\n", map.getWidth(), map.getHeight());
		if (x > 0 && x < map.getWidth()) this.x = x;
		if (y > 0 && y < map.getHeight()) this.y = y;
	}
	
	public void moveToPlayer(double x, double y) {
		double newX = x - xLength / 2;
		double newY = y - yLength / 2;
		System.out.printf("Camera wants to move to (%f, %f)\n", newX, newY);
		moveTo(newX, newY);
	}
	
	public double getScale() {
		return scale;
	}
	
	public void setScale(double scale) {
		this.scale = scale;
	}
	
	public double[] getSize() {
		return new double[] {xLength, yLength};
	}
	
	public Map getMap() {
		return map;
	}
	
	public void setMap(Map m) {
		map = m;
	}
	
	
}
