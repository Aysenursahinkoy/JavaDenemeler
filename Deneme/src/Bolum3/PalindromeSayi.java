package Bolum3;

import java.util.Scanner;

public class PalindromeSayi {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("uc basamakli bir sayi giriniz= ");
		int sayi=input.nextInt();
		int yuzlerBasamagi=sayi/100;
		int onlarBasamagi=(sayi%100)/10;
		int birlerBasamagi=sayi%10;
		if(yuzlerBasamagi==birlerBasamagi){
			System.out.println("bu sayi palindromdur");
		}
		else{
			System.out.println("bu sayi palindrom degildir");
		}
		
	}
}
