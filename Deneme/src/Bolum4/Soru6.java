package Bolum4;

public class Soru6 {
	public static void main(String[] args) {
		int random =(int)(Math.random()*(Math.PI*2.0));
		int r=40;
		int x= (int)(r*Math.cos(random));
		int y=(int)(r*Math.sin(random));
		System.out.println("aci="+random);
		System.out.println(x+" "+y);
		
	}
}
