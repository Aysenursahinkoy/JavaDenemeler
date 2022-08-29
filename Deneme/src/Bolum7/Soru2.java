package Bolum7;

import java.util.Scanner;

public class Soru2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("10 adet tam sayi giriniz = ");
		int[] sayi=new int[10];
		for (int i = 0; i < sayi.length; i++) {
			sayi[i]=input.nextInt();
	
		}
		for (int i = 9; i > -1; i--) {
		System.out.print(sayi[i]+ " ");	
		}
		
	
	}
}
