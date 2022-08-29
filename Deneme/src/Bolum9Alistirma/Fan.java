package Bolum9Alistirma;

public class Fan {

	private FanSpeed speed ;
	private boolean on;
	private double radius = 5;
	private String color = "mavi";
	
	public Fan(){
		speed=FanSpeed.SLOW;
		on=false;

	}
	public Fan(FanSpeed speed, double radius, String color, boolean isOn) {
		this.speed = speed ;
		this.radius = radius;
		this.color = color;
		this.on = isOn;
	}
	public FanSpeed getSpeed() {
		return speed;
 	}

	public void setSpeed(FanSpeed speed) {
		this.speed = speed;
	}

	public boolean getOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	
	public String toString(){
		if(on){
			return "hiz = "+getSpeed()+" aci = "+getRadius()+" renk ="+getColor()+" "+getOn();
		}
		else{
			return "fan kapali";
		}
	}

}
