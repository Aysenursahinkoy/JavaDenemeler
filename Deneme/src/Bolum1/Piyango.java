package Bolum1;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args){
		int piyango=(int)(Math.random() * 90) + 10;
		Scanner klavye = new Scanner(System.in);
		System.out.println("iki basamakli bir sayi giriniz : ");
		int tahmin= klavye.nextInt();
		
		int tahminBirlerBasamaði = tahmin %10;
		int tahminOnlarBasamaði = tahmin/10;
		
		int piyangoBirlerBasamaði = piyango%10;
		int piyangoOnlarBasamaði = piyango/10;
		System.out.println("piyango numarasi : "+piyango);
		
		if(tahmin==piyango){
			System.out.println("Tebrikler 10000 TL kazandiniz . ");
		}
		else if(piyangoOnlarBasamaði==tahminBirlerBasamaði && piyangoBirlerBasamaði==tahminOnlarBasamaði){
			System.out.println("tebrikler 3000 TL kazandiniz.... ");
		}
		else if(piyangoBirlerBasamaði==tahminBirlerBasamaði 
				|| piyangoBirlerBasamaði == tahminOnlarBasamaði 
				||piyangoOnlarBasamaði==tahminBirlerBasamaði 
				|| piyangoOnlarBasamaði == tahminOnlarBasamaði){
			System.out.println("tebrikler 1000TL kazandiniz.");
			
		}
		else{
			System.out.println("kaybettiniz.");
		}
		
	}
}
