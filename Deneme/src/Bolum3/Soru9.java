package Bolum3;

import java.util.Scanner;

public class Soru9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("bir sayi giriniz: ");
		int sayi=input.nextInt();
		int i=100000000;
		int d1=sayi/i;
		int d2=(sayi%i)/(i/10);
		int d3=(sayi%(i/10))/(i/100);
		int d4=(sayi%(i/100)/(i/1000));
		int d5=(sayi%(i/1000)/(i/10000));
		int d6=(sayi%(i/10000)/(i/100000));
		int d7=(sayi%(i/100000)/(i/1000000));
		int d8=(sayi%(i/1000000)/(i/10000000));
		int d9=(sayi%(i/10000000)/(i/100000000));
		int sonuc=(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6  * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		if(sonuc==10){
				if(d1==0){
				System.out.println("ISBN-10 sayisi= 0"+sayi+"X");
			}
				else{
					System.out.println("ISBN-10 sayisi= "+sayi+"X");
				}
			}
		else{
			
			if(d1==0){
				System.out.print("ISBN-10 sayisi= 0"+sayi);
				System.out.print(sonuc);
			}
			else{
				System.out.print("ISBN-10 sayisi= "+sayi);
				System.out.print(sonuc);
			}
		}
				
	}
}
