package Bolum7;

import java.util.Scanner;

public class Soru1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ogrenci sayisi=");
		int ogrenci=input.nextInt();
		System.out.println("ogrencilerin puanlari=");
		int[] puan=new int[ogrenci];
		for (int i = 0; i < ogrenci; i++) {
			puan[i]=input.nextInt();
			System.out.print("ogrenci "+i+" puani "+puan[i]+" ve harf notu = ");
		
		if(puan[i] >= 70){
			System.out.print("A\n");
		}
		else if(puan[i]>=55){
			System.out.print("B\n");
		}
		else if(puan[i]>=40){
			System.out.print("C\n");
		}
		else{
			System.out.print("F\n");
		}
		}
	}
}

