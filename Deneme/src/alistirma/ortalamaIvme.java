package alistirma;

import java.util.Scanner;

public class ortalamaIvme {
	public static void main(String[] args){
		Scanner klavye=new Scanner(System.in);
		System.out.println("ilk hizi giriniz : ");
		double ilkHiz=klavye.nextDouble();
		System.out.println("son hizi giriniz : ");
		double sonHiz=klavye.nextDouble();
		System.out.println("zamani giriniz saniye cinsinden : ");
		double saniye=klavye.nextDouble();
		
		double ivme=(sonHiz-ilkHiz)/saniye*100;
		
		double ivmeson =(ivme/1000);
		System.out.println("ortalama ivme  : "+ivmeson);
	}
}
