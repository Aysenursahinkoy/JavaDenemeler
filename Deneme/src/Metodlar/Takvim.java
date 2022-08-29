package Metodlar;

import java.util.Scanner;

public class Takvim {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println(" Bir yil girin (Or.2001):");
		int yil = k.nextInt();
		System.out.println(" bir ay girin 1 ve 12 arasinda:");
		int ay = k.nextInt();

		takvimYazdir(yil, ay);

	}

	private static void takvimYazdir(int yil, int ay) {
		takvimBasliginiYazdir(yil, ay);
		takvimGovdesiniYazdir(yil, ay);
	}

	private static void ayiYazdir(int yil, int ay) {
		takvimBasliginiYazdir(yil, ay);
		takvimGovdesiniYazdir(yil, ay);
	}

	private static void takvimBasliginiYazdir(int yil, int ay) {
		String ayAdi = findAyIsim(ay);
		System.out.println("            " + ayAdi + " " + yil);
		System.out.println("------------------------------");
		System.out.println("  pzt sal car per cum cts pzr");
		
	}

	private static String findAyIsim(int ay) {
		switch (ay) {
		case 1:
			return "ocak";
		case 2:
			return "subat";
		case 3:
			return "mart";
		case 4:
			return "nisan";
		case 5:
			return "mayis";
		case 6:
			return "haziran";
		case 7:
			return "temmuz";
		case 8:
			return "agustos";
		case 9:
			return "eylul";
		case 10:
			return "ekim";
		case 11:
			return "kasim";
		case 12:
			return "aralik";

		}
		return "";
	}

	private static void takvimGovdesiniYazdir(int yil, int ay) {
		int baslangicGunu = findBaslangicGunu(yil, ay);
		int aydaGunSayisi = birAydaGunSayisi(yil, ay);
		for (int i = 0; i < baslangicGunu; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= aydaGunSayisi; i++) {
			System.out.printf("%4d", i);
			baslangicGunu++;
			if (baslangicGunu % 7 == 0) {
				System.out.println();
			}
		}
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
