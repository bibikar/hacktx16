package hacktx16.entity;

public abstract class Entity {
	
	int health, maxHealth;
	double x, y;
	double xPos, yPos;
	double xVel, yVel;
	double xAccel, yAccel;
	
	public abstract void tick();
		// assuming constant N ticks/second


	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getxPos() {
		return xPos;
	}

	public void setxPos(double xPos) {
		this.xPos = xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public void setyPos(double yPos) {
		this.yPos = yPos;
	}

	public double getxVel() {
		return xVel;
	}

	public void setxVel(double xVel) {
		this.xVel = xVel;
	}

	public double getyVel() {
		return yVel;
	}

	public void setyVel(double yVel) {
		this.yVel = yVel;
	}

	public double getxAccel() {
		return xAccel;
	}

	public void setxAccel(double xAccel) {
		this.xAccel = xAccel;
	}

	public double getyAccel() {
		return yAccel;
	}

	public void setyAccel(double yAccel) {
		this.yAccel = yAccel;
	}

	
}
