package Bolum5;

import java.util.Scanner;

public class Soru17 {
	public static void main(String[] args){
		Scanner k=new Scanner(System.in);
		System.out.println("ucgen kac satir olsun :");
		int degisken=k.nextInt();
	//	final int degisken=7;
		for (int i = 0; i < degisken; i++) {
			for (int j = (degisken-1-i); j >0; j--) {
				System.out.print("    ");
			}
			for (int j = i+1; j>0; j--) {
				System.out.printf("%4d",j);
			}
			for (int j = 2; j < i+2; j++) {
				System.out.printf("%4d",j);
			}
			System.out.println();
		}
	}
}
