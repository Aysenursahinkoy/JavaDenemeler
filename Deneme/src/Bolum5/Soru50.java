package Bolum5;

import java.util.Scanner;

public class Soru50 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("gir:");
		String str = k.nextLine();

		int upper = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ('A' <= ch && ch <= 'Z')
				upper++;

		}
		System.out.println("stringteki buyuk harf sayisi : " + upper);

	}
}
