package Metodlar;

public class Arttir {
	public static void main(String[] args) {
		
		int x=5;
		System.out.println("x in arttirilmadan onceki degeri x: "+x);
		arttir(x);
		System.out.println("arttir metodundan sonra x in degeri: "+x);
		
	}

	private static void arttir(int n) {
		n++;
		System.out.println("arttir metodunun icinde n nin degeri: "+n);
	}
}
