package alistirma;

import java.util.Scanner;

public class tamSayininBasamakDegerleriToplami {
	public static void main(String[] args){
		
		Scanner klavye=new Scanner(System.in);
		System.out.println("0 ile 1000 arasýnda bir sayi giriniz : ");
		int sayi=klavye.nextInt();
		
		if(sayi<1000 && sayi>99){
			int birler=sayi%100;
			int birler2=birler%10;
			int onlar=sayi/10;
			int onlar1=onlar%10;
			int yuzler=sayi/100;
			int toplam=birler2+onlar1+yuzler;
			System.out.println("girilen sayinin basamak toplami : "+toplam);
		}
		else if(sayi<99 && sayi>9){
			int birler1=sayi%10;
			int onlar2=sayi/10;
			int toplam2=birler1+onlar2;
			System.out.println("girilen sayinin basamak toplami : " +toplam2);
		}
		else if( sayi<9){
			System.out.println("girilen sayini basamak toplami : "+sayi);
		}
		else{
			System.out.println("yanlis deger girdiniz!");
		}
		
	}
}
