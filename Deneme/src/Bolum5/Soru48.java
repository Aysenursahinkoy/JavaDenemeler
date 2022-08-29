package Bolum5;

import java.util.Scanner;

public class Soru48 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("gir:");
		String str = k.nextLine();
	
		System.out.print("girdiginiz stringin tek indeksteki harfleri: ");
		for (int i = 0; i < str.length(); i+=2) {
			char ch=str.charAt(i);
			if(ch==' '){
				continue;
			}
			System.out.print(ch);
		}
		
		
		
	}
}
