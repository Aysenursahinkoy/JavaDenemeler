package Bolum5;

public class Soru19 {
	public static void main(String[] args) {
		String string = " ";

		int sayi = 0;
		for (int satir = 0; satir <= 7; satir++) {
			for (int column = 1; column <= 7 - satir; column++) {
				System.out.printf("%4s", string);
			}

			for (int sutun = 0; sutun <= satir; sutun++) {
				sayi = (int) Math.pow(2, sutun);

				System.out.printf("%4d", sayi);
			}

			for (int sutun = satir - 1; sutun >= 0; sutun--) {
				sayi = (int) Math.pow(2, sutun);

				System.out.printf("%4d", sayi);
			}
			// new line
			System.out.println();
		}
	}
}
