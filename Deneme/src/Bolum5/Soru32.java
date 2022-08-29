package Bolum5;

public class Soru32 {
	public static void main(String[] args) {
		for (int sayi = 6; sayi <= 10000; sayi++) {
			int toplam = 0;

			for (int bolen = sayi - 1; bolen > 0; bolen--) {

				if (sayi % bolen == 0) {
					toplam += bolen;
				}

			}

			if (sayi == toplam) {
				System.out.println(sayi);
			}

		}

	}
}
