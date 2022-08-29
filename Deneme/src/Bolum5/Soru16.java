package Bolum5;

import java.util.Scanner;

public class Soru16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir tam sayi giriniz:");
		int sayi = input.nextInt();
		int bolen = 2;
		int bolunen = sayi;
		System.out.println("Asal çarpanlar: ");
		while (bolen < sayi) {
			if (bolunen % bolen == 0) {
				System.out.println(bolen);
				bolunen /= bolen;
			} else {
				bolen++;
			}
		}
	}
}
