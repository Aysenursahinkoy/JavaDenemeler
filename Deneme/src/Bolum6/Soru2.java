package Bolum6;

import java.util.Scanner;

public class Soru2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("bir tam sayi giriniz:");
		long num = input.nextLong();
		System.out.println("girilen sayilarin toplami=" + sumDigits(num));
	
		
	
	}

	private static int sumDigits(long n) {
		 int sum = 0;

	        while (n != 0) {
	            sum += n % 10;
	            n /= 10;
	        }

	        return sum;
		

	}

}
