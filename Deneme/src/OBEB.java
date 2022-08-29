import java.util.Scanner;

public class OBEB {
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("1. sayi :");
		int sayi = klavye.nextInt();
		System.out.println("2. sayi :");
		int sayi2 = klavye.nextInt();
		int obeb = 1;
		int bolen = 2;

		while (bolen <= sayi && bolen <= sayi2) {
			if (sayi % bolen == 0 && sayi2 % bolen == 0) {
				obeb = bolen;
			}
			bolen++;

		}
		int ekok = (sayi * sayi2) / obeb;

		/*
		 * for(bolen=2;bolen <= sayi && bolen<= sayi2;bolen++){ obeb=bolen; }
		 */
		System.out.println(
				sayi + " ve " + sayi2 + " sayilarinin obebi : " + obeb + " dir " + "ekoku : " + ekok + " dir.");

	}
}
