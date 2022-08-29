package Bolum4;

import java.util.Scanner;

public class Soru8 {
	public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print("ASCII kodunu giriniz: ");
	        int sayi = input.nextInt();

	        System.out.println("ASCII kodundaki karakter karsiligi " + sayi + " " + (char) sayi);
		
	}
}
