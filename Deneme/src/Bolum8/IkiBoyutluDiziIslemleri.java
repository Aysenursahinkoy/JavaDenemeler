package Bolum8;

public class IkiBoyutluDiziIslemleri {
	public static void main(String[] args) {
		int[][] ikiBoyutluDizi = new int[10][10];

		rassalDegerlerleDoldur(ikiBoyutluDizi);
		diziyiYazdir(ikiBoyutluDizi);
		int toplam = tumElemanlarinToplami(ikiBoyutluDizi);
		System.out.println();
		System.out.println("matristeki elemanlarin toplami: " + toplam);
		System.out.println();
		System.out.println("sutunlarin toplami");
		sutunlarinToplaminiYazdir(ikiBoyutluDizi);
		System.out.println("satirlarin toplami");
		satirlarinToplaminiYazdir(ikiBoyutluDizi);
		System.out.println();
		toplamiEnBuyukSatirinIndeksiniVeToplaminiYazdir(ikiBoyutluDizi);
		ikiBoyutluDiziyiYazdir(ikiBoyutluDizi);
		diziyiYazdir(ikiBoyutluDizi);
	}

	private static void rassalDegerlerleDoldur(int[][] ikiBoyutluDizi) {
		for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
				ikiBoyutluDizi[satir][sutun] = (int) (Math.random() * 100);
			}
		}
	}

	public static void diziyiYazdir(int[][] ikiBoyutluDizi) {
		/*
		 * for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) { for
		 * (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
		 * System.out.printf("%3d", ikiBoyutluDizi[satir][sutun]); }
		 * System.out.println(); }
		 */
		for (int[] is : ikiBoyutluDizi) {
			for (int i : is) {
				System.out.printf("%3d", i);

			}
			System.out.println();

		}
	}// ikiside ayni asagida foraech kullandik daha kisa oldugu icin eger deger
		// atamayacaksak en guzeli bu

	public static int tumElemanlarinToplami(int[][] ikiBoyutluDizi) {
		int toplam = 0;
		for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
				toplam += ikiBoyutluDizi[satir][sutun];
			}
		}
		return toplam;
	}

	public static void sutunlarinToplaminiYazdir(int[][] ikiBoyutluDizi) {
		// sutun toplami icin sutunlari sabit tutmam lazim ondan sutunu basa
		// aldim ve 0 olarak sabitledim
		for (int sutun = 0; sutun < ikiBoyutluDizi[0].length; sutun++) {
			int toplam = 0;// bunu icerde tanimladik cunku her sutun icin
							// toplami sifirlasin diye
			for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
				toplam += ikiBoyutluDizi[satir][sutun];
			}
			System.out.println((sutun + 1) + ". sutunun toplami: " + toplam);
		}
	}

	public static void satirlarinToplaminiYazdir(int[][] ikiBoyutluDizi) {
		// satir toplami icin satirlari sabit tutmam lazim ondan sutunu basa
		// aldim ve 0 olarak sabitledim
		for (int satir = 0; satir < ikiBoyutluDizi[0].length; satir++) {
			int toplam = 0;
			for (int sutun = 0; sutun < ikiBoyutluDizi.length; sutun++) {
				toplam += ikiBoyutluDizi[satir][sutun];
			}
			System.out.println((satir + 1) + ". satirin toplami: " + toplam);
		}
	}

	public static void toplamiEnBuyukSatirinIndeksiniVeToplaminiYazdir(int[][] ikiBoyutluDizi) {
		int enBuyukSatirToplami = -1;
		int enBuyukSatirIndeksi = -1;
		for (int satir = 0; satir < ikiBoyutluDizi[0].length; satir++) {
			int toplam = 0;
			for (int sutun = 0; sutun < ikiBoyutluDizi.length; sutun++) {
				toplam += ikiBoyutluDizi[satir][sutun];
			}
			if (toplam > enBuyukSatirToplami) {
				enBuyukSatirToplami = toplam;
				enBuyukSatirIndeksi = satir;
			}
		}
		System.out.println((enBuyukSatirIndeksi + 1) + " satir toplami en buyuktur. toplam:" + enBuyukSatirToplami);
	}

	public static void ikiBoyutluDiziyiYazdir(int[][] ikiBoyutluDizi) {
		for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
				int rassalSatir = (int) (Math.random() * ikiBoyutluDizi.length);
				int rassalSutun = (int) (Math.random() * ikiBoyutluDizi[satir].length);
				int gecici = ikiBoyutluDizi[satir][sutun];
				ikiBoyutluDizi[satir][sutun] = ikiBoyutluDizi[rassalSatir][rassalSutun];
				ikiBoyutluDizi[rassalSatir][rassalSutun] = gecici;
			}
		}
	}
}
