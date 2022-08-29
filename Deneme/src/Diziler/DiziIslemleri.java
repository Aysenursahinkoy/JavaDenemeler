package Diziler;

import java.util.Scanner;

public class DiziIslemleri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] dizi = new int[2];

		System.out.println("lutfen " + dizi.length + " tane sayi giriniz:");
		//dizinin uzunlugunu kullanicidan alarak yazdiriyoruz
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = input.nextInt();
		}
		//ustte tanimlanan diziye gore deger
		System.out.println("once " + dizi[0]);
		dizi = new int[100];
		//altta tanimlanan diziye gore deger
		System.out.println("sonra " + dizi[0]);
		
		
		// dizide random deger atiyoruz
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < dizi.length; i++) {
			System.out.printf("%3d", dizi[i]);
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}

		}
		
		
		// dizinin toplamini buluyor
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];

		}
		System.out.println("dizi elemanlarinin toplami : " + toplam);
	}

}
