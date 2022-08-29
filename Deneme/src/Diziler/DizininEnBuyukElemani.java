package Diziler;

public class DizininEnBuyukElemani {
	public static void main(String[] args) {
		int[] dizi = new int[100];
		System.out.println("\ndizinin kendisi: ");
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}

		}
		// dizinin en buyuk elemanini bulma

		int enBuyukEleman = 0;
		int enBuyukElemaninIndeksi = -1;
		for (int i = 0; i < dizi.length; i++) {
			if (enBuyukEleman < dizi[i]) {
				enBuyukEleman = dizi[i];
				// dizinin en buyuk elemaninin en kucuk indexini bulma
				enBuyukElemaninIndeksi = i;
			}
		}
		System.out.println("\ndizideki en buyuk eleman: " + enBuyukEleman + " dir");
		System.out.println("en buyuk elemainin indeksi: " + enBuyukElemaninIndeksi + "dir");

		// dizi rassal bir sekilde karistiriliyor
		System.out.println("\ndizinin karistirilmis hali:");
		for (int i = 0; i < dizi.length; i++) {
			int rassalIndex = (int) (Math.random() * dizi.length);
			int gecici = dizi[i];
			dizi[i] = dizi[rassalIndex];
			dizi[rassalIndex] = gecici;
		}
		// dizi elemanlari yazdiriliyor
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
				
			}

		}
		System.out.println("\nsola kaydirilmis hali : ");
		//dizinin elemanlarini sola kaydiriyoruz.
		int ilk=dizi[0];
		for (int i = 0; i < dizi.length-1; i++) {
			dizi[i]=dizi[i+1];
		}
		dizi[dizi.length-1]=ilk;
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}

		}

	}
}
