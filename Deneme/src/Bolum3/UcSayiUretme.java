package Bolum3;

import java.util.Scanner;

public class UcSayiUretme {
	public static void main(String[] args) {
		int random;
		int toplam = 0;
		int cevap;

		Scanner input = new Scanner(System.in);
		System.out.println("toplanmasi gereken sayilar");
		for (int i = 0; i < 3; i++) {
			random = (int) (Math.random() * 100);
			System.out.print(random);
			System.out.println();
			toplam += random;
		}
		System.out.println("sayilarin toplami nedir? ");
		cevap = input.nextInt();
		if (toplam == cevap) {
			System.out.println("cevap dogru");
		} else {
			System.out.println("yanlis cevap tekrar deneyin");

			for (int i = 1; i <= 2; i++) {
				System.out.println("sayilarin toplami nedir?");
				cevap = input.nextInt();
				if (cevap == toplam) {
					break;

				}else if(i==2){
					System.out.println("deneme hakkiniz bitti");
				}
			}

		}
	}
}
