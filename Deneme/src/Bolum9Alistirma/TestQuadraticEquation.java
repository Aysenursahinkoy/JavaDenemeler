package Bolum9Alistirma;

import java.util.Scanner;

public class TestQuadraticEquation {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("a=");
		double a=input.nextDouble();
		System.out.print("b=");
		double b=input.nextDouble();
		System.out.print("c=");
		double c=input.nextDouble();
		
		
		QuadraticEquation a1=new QuadraticEquation(a,b,c);
		System.out.println(a1);
		QuadraticEquation a2=new QuadraticEquation(1,8,12);
		System.out.println(a2);
		
	}
}
