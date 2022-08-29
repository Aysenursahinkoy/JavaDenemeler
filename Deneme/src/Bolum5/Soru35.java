package Bolum5;

public class Soru35 {
	public static void main(String[] args) {
		double toplam=0;
		for (int i = 1; i < 625; i++) {
				toplam+=1.0/(Math.sqrt(i)+Math.sqrt(i+1.0));
			}
		
	System.out.println(toplam);
	}
}
