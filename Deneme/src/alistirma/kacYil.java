package alistirma;

import java.util.Scanner;

public class kacYil {
	public static void main(String[] args){
		Scanner klavye=new Scanner(System.in);
		System.out.println("bir zaman dilimi giriniz : ");
		int zaman= klavye.nextInt();
		int gun=zaman/1440;
		
		int yil=gun/365;
		int kalan=gun%365;
	
		System.out.println("yil : "+yil+" gun : "+kalan);
		
	}
}
