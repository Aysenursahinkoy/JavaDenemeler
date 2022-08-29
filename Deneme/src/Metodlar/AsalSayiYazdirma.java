package Metodlar;

public class AsalSayiYazdirma {
	public static void main(String[] args) {
		AsalSayiYazdir(500 );
	}

	private static void AsalSayiYazdir(int asalSayi) {
		final int satirdaki_asal_sayi=20;
		int asalSayiSayaci = 0;
		int sayi = 2;
		while (sayi < 1000) {
			if (asalMi(sayi)) {
				System.out.printf("%4d", sayi);
				
				asalSayiSayaci++;
				if (asalSayiSayaci%satirdaki_asal_sayi==0) {
					System.out.println();
				}
			}
			sayi++;
			}
	}

	public static boolean asalMi(int sayiAsal) {
		for (int i = 2; i < sayiAsal; i++) {
			if (sayiAsal % i == 0) {
				return false;
			}
		}
		return true;
	}
}
