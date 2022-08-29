package Diziler;

public class ArrayKopyalama {
	public static void main(String[] args) {
		referansKopyalamasi();
		System.out.println("------------------");
		degerKoyalamasi();

	}

	public static void degerKoyalamasi() {
		int[] dizi1 = { 8, 9, 10 };
		int[] dizi2 = { 11, 12, 13 };
		//buradaki int 1 int 2 ile referansKopyalamasindaki int1 int2 nin alakasi yoktur
		//her method kendi icindeki degerleri bilir.
		//lokal degiskenlerdir method bitince biterler.
		System.out.println(dizi1[0]);
		System.out.println(dizi2[0]);
		
		for (int i = 0; i < 3; i++) {
			dizi2[i] =dizi1[i];
		}
		dizi2[2] = 99;

		System.out.println(dizi2[2]);
		System.out.println(dizi1[2]);
		//ikisde 99 olmadi biri 99 digeri 10 olarak kaldi cunku burada
		//deger kopyaladik refreans degil hala ramde dizi2 var silinmedi sadece dizi1 in degerlerini aldi
	}

	private static void referansKopyalamasi() {
		int[] dizi1 = { 1, 2, 3 };
		int[] dizi2 = { 4, 5, 6 };

		System.out.println("once:");

		System.out.println(dizi1[0]);
		System.out.println(dizi2[0]);

		dizi2 = dizi1; // kopyalama islemi yapiliyor
		// bundan sonra dizi2 nin ilk degrleri yani 4 5 6 garbage collection
		// oldu
		// java bunu bizim icin cop yapti ramde artik yok ve yer kaplamiyor

		System.out.println("sonra:");

		System.out.println(dizi1[0]);
		System.out.println(dizi2[0]);

		dizi2[2] = 99;

		System.out.println(dizi2[2]);
		System.out.println(dizi1[2]);
		// ikiside 99 olur cunku artik ayni yeri gosteriyorlar
		//referans kopyaladigimiz icin
	}
}
