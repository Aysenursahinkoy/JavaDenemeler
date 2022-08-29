package Bolum5;

import java.util.Scanner;

public class Soru36 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("bir sayi giriniz: ");
		int sayi=input.nextInt();
		int bolen=100000000;
		int toplam=0;
		for (int i = 1; i < 10; i++) {
            if (i == 9){
                toplam += sayi % 10 * i;
                toplam = toplam % 11;
            }
            else
                toplam += sayi / bolen % 10 * i;
            bolen = bolen / 10;

        }

        bolen = 100000000;
        while (sayi / bolen == 0) {
            System.out.print("0");
            bolen = bolen / 10;
        }
        System.out.print(sayi);
        if (toplam == 10) {
            System.out.print("X");
        } else {
            System.out.print(toplam);
        }
		
	}
}
