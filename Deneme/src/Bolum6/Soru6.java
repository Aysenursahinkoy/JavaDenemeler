package Bolum6;

import java.util.Scanner;

public class Soru6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);	
		System.out.println("ucgen kac satir olsun = ");
		int n=input.nextInt();
		displayPattern(n);
	}

	private static void displayPattern(final int n) {
		for (int i = 0; i < n; i++) {
			for (int j = (n-1-i); j >0; j--) {
				System.out.print("    ");
			}
			for (int j = i+1; j>0; j--) {
				System.out.printf("%4d",j);
			}
			
			System.out.println();
		}
	}
}


