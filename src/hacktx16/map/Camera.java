package hacktx16.map;

public class Camera {

	double x, y; // in absolute coordinates
	double xLength, yLength; // these are in absolute coordinates
	double scale;
	
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
	
}
