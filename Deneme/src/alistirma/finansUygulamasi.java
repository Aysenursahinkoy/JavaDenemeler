package alistirma;

import java.util.Scanner;

public class finansUygulamasi {
		public static void main(String[] args){
			
			Scanner klavye=new Scanner(System.in);
			
			System.out.println("ara toplami giriniz : ");
			double araToplam=klavye.nextDouble();
			System.out.println("komisyon oranini giriniz : ");
			double komisyon=klavye.nextDouble();
			
			double a= araToplam*(komisyon/100);
			double toplam=araToplam+a;
			
			System.out.println("komisyon orani : "+a+"TL ara toplam : "+toplam+"TL");
		}

}
