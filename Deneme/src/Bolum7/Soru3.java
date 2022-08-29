package Bolum7;

import java.util.Scanner;

public class Soru3 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		int sayiSayisi = 20;
		int sayiDizisi[] = new int[sayiSayisi];
		int bakildimi[] = new int[sayiSayisi];
		for (int i = 0; i < sayiSayisi; i++) {
			System.out.print((i + 1) + ". Sayýyý gir = > ");
			sayiDizisi[i] = input.nextInt();
			if(sayiDizisi[i]<=0 || sayiDizisi[i]>=100){
				break;
			}

		}
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
				//System.out.println(sayiDizisi[i] + " Sayýsýndan " + sayiAdedi + " tane var ");
				System.out.println(sayiDizisi[i]);
			}
		}
	}
}
