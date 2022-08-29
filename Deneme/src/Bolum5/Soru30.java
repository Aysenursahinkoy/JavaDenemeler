package Bolum5;

import java.util.Scanner;

public class Soru30 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("yatirilacak miktar=");
		double miktar=input.nextDouble();
		System.out.println("faiz orani nedir=");
		double faiz=input.nextDouble();
		System.out.println("sure ne kadar=");
		double sure=input.nextDouble();
		
		double faizTutari=1+(faiz/1200);
		System.out.println(" ay              tutar");
		System.out.println("----             -----");
		double formul=miktar;
		for (int i = 1; i <= sure; i++) {
			formul*=faizTutari;
			System.out.printf("%5d%20.2f\n",i,formul);
			
		}
		
	}
}
