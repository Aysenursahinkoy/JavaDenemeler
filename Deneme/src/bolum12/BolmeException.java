package bolum12;

import java.util.Scanner;

public class BolmeException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two Integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		// hata yakalar
		try {
			System.out.println(num1 + " / " + num2 + " = " + bol(num1, num2));
		} catch (Exception e) {
			System.out.println(e.getMessage());// hatadaki mesaji yazar
			e.printStackTrace();
		}

		System.out.println("program devam ediyor");
	}

	public static int bol(int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException("payda sifir olamaz "); // hata
																	// firlatir
		}
		return num1 / num2;
	}
	
}
