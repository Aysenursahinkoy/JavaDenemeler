package Bolum3;

import java.util.Scanner;

public class HaftaninGunu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bugune karsilik gelen sayiyi giriniz (orn: pazar 0,cuma 5)");
		int gun = input.nextInt();
		
		System.out.println("kac gun sonraki gunu ogrenmek istersiniz?");
		int istenilenGun = input.nextInt();
		int a=istenilenGun+gun;
		
		
		if(a<7){
			if (a == 0) {
				System.out.println("pazar");
			} else if (a == 1) {
				System.out.println("p.tesi");
			} else if (a == 2) {
				System.out.println("sali");
			} else if (a == 3) {
				System.out.println("carsamba");
			} else if (a == 4) {
				System.out.println("persembe");
			} else if (a == 5) {
				System.out.println("cuma");
			} else if (a == 6) {
				System.out.println("c.tesi");
			}
		}
			
		
		else if(a>7){
			int sonuc=a%7;
			if (sonuc == 0) {
				System.out.println("pazar");
			} else if (sonuc == 1) {
				System.out.println("p.tesi");
			} else if (sonuc == 2) {
				System.out.println("sali");
			} else if (sonuc == 3) {
				System.out.println("carsamba");
			} else if (sonuc == 4) {
				System.out.println("persembe");
			} else if (sonuc == 5) {
				System.out.println("cuma");
			} else if (sonuc == 6) {
				System.out.println("c.tesi");
			}
		}
			
		}

}
	

	
