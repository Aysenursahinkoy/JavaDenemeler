package Bolum6;

import java.util.Scanner;

public class Soru3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz =  ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + "  palindrome.");
        } else {
            System.out.println(num + " NOT palindrome.");

        }

    }

    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {

            reverse *= 10; // 
            reverse += number % 10;
            number /= 10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {

        return (number == reverse(number));
    }
	
}