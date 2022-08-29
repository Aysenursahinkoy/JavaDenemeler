package Bolum5;

public class Soru43 {
	public static void main(String[] args) {

		int toplam = 0;
		for (int i = 1; i < 8; i++) {
			for (int j = i + 1; j < 8; j++) {
				System.out.println(i + " " + j);
				toplam++;
			}
		}

		System.out.println("Total combination: " + toplam);
	}
}
