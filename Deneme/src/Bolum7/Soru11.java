package Bolum7;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double[] number = new double[10];
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextDouble();
		}
			System.out.println("the mean is = " + mean(number));
			System.out.println("the standard deviation is = " + deviation(number));
		
	}

	private static double deviation(double[] number) {
		int total = 0;
		double mean = mean(number);
		for (int i = 0; i < number.length; i++) {
			total += (number[i] - mean(number));

		}
		double operation1 = Math.pow(total, 2);
		double operation2 = operation1 / (number.length - 1);
		double operation3 = Math.sqrt(operation2);
		return operation3;
	}

	private static double mean(double[] number) {
		
		int total = 0;
		
		for (int i = 0; i < number.length; i++) {
			total += number[i];

		}
		double m = total / number.length;
		return m;
	}

}
