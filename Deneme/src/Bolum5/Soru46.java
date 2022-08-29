package Bolum5;

import java.util.Scanner;

public class Soru46 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("gir:");
		String str = k.nextLine();

		StringBuffer buffer = new StringBuffer(str);
		System.out.println(buffer.reverse());
		
		/*String result = ""; 
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		System.out.println(result);*/
	}
}
