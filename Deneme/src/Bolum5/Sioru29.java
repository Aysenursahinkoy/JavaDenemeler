package Bolum5;

import java.util.Scanner;

public class Sioru29 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println(" Bir yil girin (Or.2001):");
		int yil = k.nextInt();
		System.out.println(" bir gun girin 1 ve 7 arasinda:");
		int gun = k.nextInt();
		
		yazdir(yil, gun);
	}
	private static void yazdir(int yil,int ay){
		findBaslangicGunu(yil, ay);
		System.out.println("1 "+ay+" "+yil );
		
	}

	private static String findGunIsim(int gun) {
		switch (gun) {
		case 1:
			return "pazar";
		case 2:
			return "pazartesi";
		case 3:
			return "sali";
		case 4:
			return "carsamba";
		case 5:
			return "persembe";
		case 6:
			return "cuma";
		case 7:
			return "cumartesi";

		}
		return "";
	}

	private static int findBaslangicGunu(int yil, int ay) {
		final int OCAK_1_1800_GUNU = 2;
		int toplamGun = toplamGunSayisiniBul(yil, ay);
		

		return (toplamGun + OCAK_1_1800_GUNU) % 7;
		
	}

	private static int toplamGunSayisiniBul(int yil, int ay) {
		int toplamGun = 0;
		for (int i = 1800; i < yil; i++) {
			toplamGun += artikYilMi(i) ? 366 : 365;
		}
		for (int i = 1; i < ay; i++) {
			toplamGun += birAydaGunSayisi(yil, i);
		}
		return toplamGun;
	}

	public static int birAydaGunSayisi(int yil, int ay) {
		if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12)
			return 31;
		if (ay == 4 || ay == 6 || ay == 9 || ay == 11)
			return 30;
		if (ay == 2)
			return artikYilMi(yil) ? 29 : 28;
		return 0;
	}

	private static boolean artikYilMi(int yil) {
		return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);

	}
}
