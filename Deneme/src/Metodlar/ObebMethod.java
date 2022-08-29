package Metodlar;

import java.util.Scanner;
//bu kodu default package icindeki OBEB classindan aldim ve refactor method yaparak method haline benim yerine ide getirdi
public class ObebMethod {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("1. sayi :");
		int sayi = klavye.nextInt();
		System.out.println("2. sayi :");
		int sayi2 = klavye.nextInt();
		int obeb = obeb(sayi, sayi2);
		int ekok = ekok(sayi, sayi2, obeb);
		System.out.println(sayi + " ve " + sayi2 + " sayilarinin obebi : " + obeb + " dir " + "ekoku : " + ekok + " dir.");

	}

	private static int ekok(int sayi, int sayi2, int obeb) {
		int ekok = (sayi * sayi2) / obeb;
		return ekok;
	}

	private static int obeb(int sayi, int sayi2) {
		int obeb = 1;
		int bolen = 2;

		while (bolen <= sayi && bolen <= sayi2) {
			if (sayi % bolen == 0 && sayi2 % bolen == 0) {
				obeb = bolen;
			}
			bolen++;

		}
		return obeb;
	}
}
