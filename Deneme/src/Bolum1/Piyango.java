package Bolum1;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args){
		int piyango=(int)(Math.random() * 90) + 10;
		Scanner klavye = new Scanner(System.in);
		System.out.println("iki basamakli bir sayi giriniz : ");
		int tahmin= klavye.nextInt();
		
		int tahminBirlerBasamaği = tahmin %10;
		int tahminOnlarBasamaği = tahmin/10;
		
		int piyangoBirlerBasamaği = piyango%10;
		int piyangoOnlarBasamaği = piyango/10;
		System.out.println("piyango numarasi : "+piyango);
		
		if(tahmin==piyango){
			System.out.println("Tebrikler 10000 TL kazandiniz . ");
		}
		else if(piyangoOnlarBasamaği==tahminBirlerBasamaği && piyangoBirlerBasamaği==tahminOnlarBasamaği){
			System.out.println("tebrikler 3000 TL kazandiniz.... ");
		}
		else if(piyangoBirlerBasamaği==tahminBirlerBasamaği 
				|| piyangoBirlerBasamaği == tahminOnlarBasamaği 
				||piyangoOnlarBasamaği==tahminBirlerBasamaği 
				|| piyangoOnlarBasamaği == tahminOnlarBasamaği){
			System.out.println("tebrikler 1000TL kazandiniz.");
			
		}
		else{
			System.out.println("kaybettiniz.");
		}
		
	}
}
