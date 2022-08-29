package Bolum7;

import java.util.Scanner;

public class Soru5 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		int sayiSayisi = 10;
		int sayiDizisi[] = new int[sayiSayisi];
		int bakildimi[] = new int[sayiSayisi];
		for (int i = 0; i < sayiSayisi; i++) {
			System.out.print((i + 1) + ". Sayýyý gir = > ");
			sayiDizisi[i] = input.nextInt();

		}

		System.out.print("bir sayi daha girin = > ");
		int sayi = input.nextInt();
		int bakilansayi = 0;
		for (int i = 0; i < sayiSayisi; i++) {
			int sayac = 0;
			for (int j = 0; j < sayiSayisi; j++) {
				if (sayiDizisi[i] == bakildimi[j]) {
					sayac++;
				}
			}
			if (sayac == 0) {
				int sayiAdedi = 0;
				for (int t = 0; t < sayiSayisi; t++) {
					if (sayiDizisi[i] == sayiDizisi[t]) {
						sayiAdedi++;
					}
				}

				bakildimi[bakilansayi] = sayiDizisi[i];
				bakilansayi++;
				System.out.print(sayiDizisi[i] + " ");

			}

		}
		for (int i = 0; i < sayiDizisi[i]; i++) {

			if (sayiDizisi[i] != sayi) {
				System.out.print(sayi);
				break;
			}
			else if(sayiDizisi[i]==sayi){
				break;
			}
			
		}
	}
}
