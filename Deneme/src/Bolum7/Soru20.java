package Bolum7;

import java.util.Scanner;

public class Soru20 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("dizinin uzunlugu = ");
		int lenght=input.nextInt();
		System.out.println("dizinin degerleri : ");
		
		int [] list=new int[lenght];
		for (int i = 0; i < list.length; i++) {
			list[i]=input.nextInt();
		
		}
		
	}
	
}
