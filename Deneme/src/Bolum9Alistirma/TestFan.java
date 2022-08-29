package Bolum9Alistirma;

public class TestFan {
	public static void main(String[] args) {
		Fan f1=new Fan();
		
		f1.setSpeed(FanSpeed.FAST);
		f1.setRadius(10);
		f1.setColor("sari");
		f1.setOn(true);
		
		Fan f2=new Fan();
		
		f2.setSpeed(FanSpeed.MEDIUM);
		f2.setRadius(5);
		f2.setColor("mavi");
		f2.setOn(false);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
		
		
		
	}
}
