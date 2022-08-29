package Bolum10;

import java.util.Scanner;

public class PalindronMuKontrol {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String s=input.nextLine();
		
		System.out.println("Ignoring non-alphanumeric characters, \nis " + s + "palindrome?  " +isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		s=filtrele(s);
		String ters = tersiniAl(s);
		
		return s.equalsIgnoreCase(ters);
	}

	private static String tersiniAl(String s) {
		StringBuilder str = new StringBuilder();
		str.append(s);
		return str.reverse().toString();
	}

	private static String filtrele(String s) {
		StringBuilder str =new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i))){
			str.append(s.charAt(i));
		}
		}
		return str.toString();
	}
}
