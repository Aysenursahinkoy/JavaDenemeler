package bolum12;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class Bolme {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two Integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		GeriDonus gd = bolme(num1, num2);
		if (gd.basariliMi == false) {
			System.out.println("payda sifir olamaz");
		} else {

			System.out.println(num1 + " / " + num2 + " is " + gd.bolum);

		}
	}

	private static GeriDonus bolme(int num1, int num2) {
		if (num2 == 0) {
			return new GeriDonus(false);

		}
		return new GeriDonus(true, num1 / num2);
	}
}

class GeriDonus {
	public boolean basariliMi = false;
	public int bolum;

	public GeriDonus(boolean basariliMi) {
		this.basariliMi = basariliMi;
	}

	public GeriDonus(boolean basariliMi, int bolum) {
		this.basariliMi = basariliMi;
		this.bolum = bolum;
	}

}