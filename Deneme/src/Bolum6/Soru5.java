package Bolum6;

import java.util.Scanner;

public class Soru5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("uc sayi giriniz:");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		displaySortedNumbers(num1, num2, num3);
	}

	private static void displaySortedNumbers(double num1, double num2, double num3) {
		if (num1 > num2 && num2 > num3) {
			System.out.println(num1 + ">" + num2 + ">" + num3);
		}

		else if (num1 > num2 && num3 > num2) {
			System.out.println(num1 + ">" + num3 + ">" + num2);

		} else if (num2 > num3 && num3 > num1) {

			System.out.println(num2 + ">" + num3 + ">" + num1);
		} else if (num2 > num3 && num1 > num3) {
			System.out.println(num2 + ">" + num1 + ">" + num3);

		} else if (num3 > num2 && num2 > num1) {

			System.out.println(num3 + ">" + num2 + ">" + num1);

		} else if (num3 > num2 && num1 > num2) {
			System.out.println(num3 + ">" + num1 + ">" + num2);
		}
	}
	//swap algoritmasi ilede yapanbiliriz daha kisa olur
	/* double temp;
     if (num1 > num2) {
         temp = num1;
         num1 = num2;
         num2 = temp;
     }

     if (num2 > num3) {
         temp = num2;
         num2 = num3;
         num3 = temp;
     }
     if (num1 > num2) {
         temp = num1;
         num1 = num2;
         num2 = temp;
     }
     System.out.println(num1 + " " + num2 + " " + num3);
 }*/
	

}
