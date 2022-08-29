package Bolum5;

import java.util.Scanner;

public class Soru21 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("bakiye giriniz: ");
		double bakiye = input.nextDouble();

		System.out.print("yil giriniz: ");
		int yil = input.nextInt();

		System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		for (double faiz = 5.00; faiz <= 8.00; faiz += 0.125) {

			double aylikFaiz = faiz / 1200;
			double aylikTutar = bakiye * aylikFaiz
					/ (1 - 1 / Math.pow(1 + aylikFaiz, yil * 12));

			double toplamOdeme = aylikTutar * yil * 12;

			String str = "%";

			System.out.printf("%-1.3f%s%17.2f%24.2f \n", faiz, str, ((int) (aylikTutar * 100) / 100.0),
					((int) (toplamOdeme * 100) / 100.0));

		}
	}
}
