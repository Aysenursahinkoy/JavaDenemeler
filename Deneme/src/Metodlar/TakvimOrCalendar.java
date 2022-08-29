package Metodlar;

import java.util.Scanner;

public class TakvimOrCalendar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//kullanici ingilizce takvim icin (pazar gununden baslayan) 0 turkce takvim icin(p.tesi gununden baslayan 1 secsin
		
		String sec = "	Turkce Takvim (1)\n" + "	English Calendar (0)\n" + "        Exit or Cikis  (q) ";
		System.out.println("********************************");
		System.out.println(sec);
		System.out.println("********************************");
		//kullanici q ya basana kadar loop devam etsin
		while (true) {
			//kullanici 0 1 ya da q secsin
			System.out.print("\nPlease choose one of the options OR Bir secim yapiniz : ");
			String s = input.nextLine();
			if (s.equals("q")) {
				//kullanici q secerse exit console yazilsin ve program dursun
				System.out.println("EXIT");
				break;
			} else if (s.equals("0")) {
				
				System.out.print("Enter full year (e.g., 2012): ");
				int year = input.nextInt();
				System.out.print("Enter month as a number between 1 and 12: ");
				int month = input.nextInt();

				printMonth(year, month);

			} else if (s.equals("1")) {
				System.out.print(" \nBir yil girin (Or.,2001):");
				int yil = input.nextInt();
				System.out.print("Bir ay girin 1 ve 12 arasinda:");
				int ay = input.nextInt();

				takvimYazdir(yil, ay);
			}

		}
	}
	//Print the calendar for a month in a year
	private static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}
	//* Print the month title
	public static void printMonthTitle(int year, int month) {
		System.out.println(" " + getMonthName(month) + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

	}
	//Print month body
	public static void printMonthBody(int year, int month) {
		//Get start day of the week for the first date in the month
		int startDay = getStartDay(year, month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print(" ");

		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}

		System.out.println();

	}
	//Get the English name for the month *
	public static String getMonthName(int month) {
		switch (month) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";

		}
		return "";
	}
	//* Get the start day of month 1 year
	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;

	}
	//Get the total number of days since January 1, 1800
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;

	}
	//Get the number of days in a month
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2)
			return isLeapYear(year) ? 29 : 28;
		return 0;
	}
	//Determine if it is a leap year
	public static Boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	//takvimi yazdir
	private static void takvimYazdir(int yil, int ay) {
		takvimBasliginiYazdir(yil, ay);
		takvimGovdesiniYazdir(yil, ay);
	}
	//ayi yazdir
	private static void ayiYazdir(int yil, int ay) {
		takvimBasliginiYazdir(yil, ay);
		takvimGovdesiniYazdir(yil, ay);
	}
	//takvim header yazdir
	private static void takvimBasliginiYazdir(int yil, int ay) {
		String ayAdi = findAyIsim(ay);
		System.out.println("            " + ayAdi + " " + yil);
		System.out.println("------------------------------");
		System.out.println("  pzt sal car per cum cts pzr");

	}
	//aylari yazdir
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
	//takvimin govdesini yazdir
	private static void takvimGovdesiniYazdir(int yil, int ay) {
		//Ayın ilk tarihi için haftanın başlangıç ​​gününü öğrenin
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
	//ayin baslangic gununu bul
	private static int findBaslangicGunu(int yil, int ay) {
		final int OCAK_1_1800_GUNU = 2;
		int toplamGun = toplamGunSayisiniBul(yil, ay);

		return (toplamGun + OCAK_1_1800_GUNU) % 7;
	}
	//1 yil kac gun artik yil ile kontrol
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
	//bir ay kac gun cekiyor
	public static int birAydaGunSayisi(int yil, int ay) {
		if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12)
			return 31;
		if (ay == 4 || ay == 6 || ay == 9 || ay == 11)
			return 30;
		if (ay == 2)
			return artikYilMi(yil) ? 29 : 28;
		return 0;
	}
	// artik yil kontrolu
	private static boolean artikYilMi(int yil) {
		return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);

	}
}
