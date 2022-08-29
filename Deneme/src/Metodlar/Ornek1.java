package Metodlar;

public class Ornek1 {
	public static void main(String[] args) {
		System.out.println("1 den 10 na kadar olan sayilarin toplami : " + toplam(1, 10));
		System.out.println("5 den 15 na kadar olan sayilarin toplami : " + toplam(5, 15));
		System.out.println("22 den 33 na kadar olan sayilarin toplami : " + toplam(22, 33));
		int toplam=toplam(1,12);
		System.out.println(toplam);


	}

	static int toplam(int sayi1, int sayi2) {
		int toplam = 0;
		for (int i = sayi1; i <= sayi2; i++) {
			toplam+=i;
			
		}
		return toplam;
	}
	static int carp(int sayi1, int sayi2){
		int carp = sayi1 * sayi2 ;
		return carp;
	}
}
