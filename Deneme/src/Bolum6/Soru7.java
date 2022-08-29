package Bolum6;

import java.util.Scanner;

public class Soru7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("yatirim miktari=");
		double amount=input.nextDouble();
		System.out.println("yillik faiz orani=");
		double monthlyInterestRate=input.nextDouble();
		
		System.out.println("yil sayisi giriniz=");
		int years=input.nextInt();
		
		futureInvestmentValue(amount, monthlyInterestRate, years);
		
	}

	public static void futureInvestmentValue(double amount, double monthlyInterestRate, int years) {
		double 	futureInvestmentValue =amount * Math.pow((1 + monthlyInterestRate), years*12);
				//

		System.out.println(futureInvestmentValue+amount);
	}

	
}