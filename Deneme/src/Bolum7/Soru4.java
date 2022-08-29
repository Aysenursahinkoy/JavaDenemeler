package Bolum7;

import java.util.Scanner;

import alistirma.ortalamaIvme;

public class Soru4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi = 100;
		int[] sayiDizisi = new int[sayi];
		int sayac = 0;
		int toplam = 0;
		int ortalamaUstu = 0;
		int ortalamayaEsit = 0;
		int ortalamaAlti = 0;
		System.out.println("notlari giriniz = ");
		for (int i = 0; i < sayiDizisi.length; i++) {
			System.out.print((i + 1) + ".not= ");
			sayiDizisi[i] = input.nextInt();
			sayac++;
			toplam += sayiDizisi[i];

			if (sayiDizisi[i] <= 0 || sayiDizisi[i] > 100) {
				break;
			}

		}
		for (int i = 0; i < sayac - 1; i++) {
			double ortalama = toplam / (sayac - 1);
			if (ortalama < sayiDizisi[i]) {
				ortalamaUstu++;

			}
			if (ortalama == sayiDizisi[i]) {
				ortalamayaEsit++;
			}
			if (ortalama > sayiDizisi[i]) {
				ortalamaAlti++;
			}
		}

		System.out.println("ortalamanin ustundeki not sayisi = " + ortalamaUstu);
		System.out.println("ortalamanin altindaki not sayisi = " + ortalamaAlti);
		System.out.println("ortalamaya esit not sayisi = " + ortalamayaEsit);
	}
}
