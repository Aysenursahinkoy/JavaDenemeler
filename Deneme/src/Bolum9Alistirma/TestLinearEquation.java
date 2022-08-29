package Bolum9Alistirma;

import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("a=");
		double a=input.nextDouble();
		System.out.print("b=");
		double b=input.nextDouble();
		System.out.print("c=");
		double c=input.nextDouble();
		System.out.print("d=");
		double d=input.nextDouble();
		System.out.print("e=");
		double e=input.nextDouble();
		System.out.print("f=");
		double f=input.nextDouble();
		
		LinearEquation x=new LinearEquation(a,b,c,d,e,f);
		System.out.println(x);
	}
}
