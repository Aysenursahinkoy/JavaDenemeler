package Bolum10Alistirma;

public class MyPoint {
	private double x;
	private double y;

	MyPoint() {
		this.x = 0;
		this.y = 0;
	
	}

	MyPoint(double x, double y) {
		this();
		
	}

	public double distance(double a, double b) {

		return Math.sqrt((Math.pow((x - a), 2) + Math.pow(y - b, 2)));
	}

	public double distancex() {
		return Math.sqrt((Math.pow((x - getX()), 2) + Math.pow(y - getY(), 2)));
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

}
