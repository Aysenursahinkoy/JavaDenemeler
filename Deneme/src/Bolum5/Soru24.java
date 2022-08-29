package Bolum5;

public class Soru24 {
	public static void main(String[] args) {
		double toplam = 0;
		for (double i = 1; i <= 97; i += 2) {
			double a = i / (i + 2);
			toplam = toplam + a;

		}
	
		
		System.out.println(toplam);
	
	}
}
