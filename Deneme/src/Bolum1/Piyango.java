package Bolum1;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args){
		int piyango=(int)(Math.random() * 90) + 10;
		Scanner klavye = new Scanner(System.in);
		System.out.println("iki basamakli bir sayi giriniz : ");
		int tahmin= klavye.nextInt();
		
		int tahminBirlerBasama�i = tahmin %10;
		int tahminOnlarBasama�i = tahmin/10;
		
		int piyangoBirlerBasama�i = piyango%10;
		int piyangoOnlarBasama�i = piyango/10;
		System.out.println("piyango numarasi : "+piyango);
		
		if(tahmin==piyango){
			System.out.println("Tebrikler 10000 TL kazandiniz . ");
		}
		else if(piyangoOnlarBasama�i==tahminBirlerBasama�i && piyangoBirlerBasama�i==tahminOnlarBasama�i){
			System.out.println("tebrikler 3000 TL kazandiniz.... ");
		}
		else if(piyangoBirlerBasama�i==tahminBirlerBasama�i 
				|| piyangoBirlerBasama�i == tahminOnlarBasama�i 
				||piyangoOnlarBasama�i==tahminBirlerBasama�i 
				|| piyangoOnlarBasama�i == tahminOnlarBasama�i){
			System.out.println("tebrikler 1000TL kazandiniz.");
			
		}
		else{
			System.out.println("kaybettiniz.");
		}
		
	}
}
