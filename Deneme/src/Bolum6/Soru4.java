package Bolum6;

import java.util.Scanner;

public class Soru4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir tam sayi giriniz =  ");
		int num = input.nextInt();
		
		System.out.print(num+" sayisinin tersi = ");
		reverse(num);
	}

	private static void reverse(int num) {
		int reverse = 0;
		while (num != 0) {

			reverse = num % 10;
			num /= 10;
			System.out.print(reverse);
		}
		

	}
}
