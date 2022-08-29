package Bolum10;

import java.util.Date;

public class StringSinifi2 {
	public static void main(String[] args) {
		
		System.out.println(new Date().toString());//referans ile nesne yaratiliyor.
		
		//"Welcome".replace('e', 'A');//referansiz nesne
		
		String s= "Welcome";
		String s1=s.replace('e', 'A');
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println("welcome".replaceFirst("e", "AB"));
		
		System.out.println("welcome".replace("e", "AB"));

		System.out.println("welcome".replaceFirst("el", "AB"));
		
		String[] tokens = "Java#HTML#Perl".split("#");
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i]+" ");
		}
		
		s = "Java HTML Perl C The StringBuilder and TringBuffer classes are similar to the String class";
		String[] kelimeler = s.split(" ");
		for (int i = 0; i < kelimeler.length; i++) {
			System.out.println(kelimeler[i]+" ");
		}

	}
}
