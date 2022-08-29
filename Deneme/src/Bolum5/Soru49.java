package Bolum5;

import java.util.Scanner;

public class Soru49 {

	public static void main(String[] args) {

		int sayac = 0;
		int a = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Metin giriniz: ");
		String metin = input.nextLine();

		for (int i = 0; i < metin.length(); i++) {
			char k = metin.charAt(i);
			if (k == 'a' || k == 'e' || k == 'ý' || k == 'i' || k == 'o' || k == 'ö' || k == 'u' || k == 'ü')
				sayac++;
			else if (k == ' ')
				a++;

		}
		System.out.println(sayac + " adet sesli harf vardýr.");
		System.out.println(metin.length() - sayac - a + " sessiz harf var");

	}
}
