package Bolum5;

import java.util.Scanner;

public class Soru51 {

	static String commonPrefixUtil(String str1, String str2) {
		String result = "";// bos bir string olusturdum sayac=0; demek gibi
		// asagida iki dizide 0 indexten uzunlukarinin 1 eksigi kadar dedik
		// cunku dizilerde uzunluk 1 eksigi kadar 0 dan basladigi icin saymaya

		for (int i = 0, j = 0; i <= str1.length() - 1 && j <= str2.length() - 1; i++, j++) {
			if (str1.charAt(i) != str2.charAt(j)) {
				break; // str1 ve str2 nin indexlerindeki harfler esit degilse
						// dongu dursun.
			}
			result += str1.charAt(i); // str1 ya da str2 farketmez eger esitse
										// str1 in harfleri resulta eklenmeye
										// baslar
		}

		return (result);// dongu bitene kadar eklemeye devam eder
	}

	static String ayniString(String dizi[], int n) {
		String baslangic = dizi[0];
		n=dizi.length;
		for (int i = 1; i <= n - 1; i++) {
			baslangic = commonPrefixUtil(baslangic, dizi[i]);
		}

		return (baslangic);
	}

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("gir");
		String a = k.nextLine();
		System.out.println("gir:");
		String b = k.nextLine();
		String dizi[] = { a, b };

		String ans = ayniString(dizi, dizi.length);

		if (ans.length() > 0) {
			System.out.printf("Stringlerde ortak olan baslangiclar: - %s", ans);
		} else {
			System.out.printf("stringlerde ortaklik yok");
		}
	}

}
