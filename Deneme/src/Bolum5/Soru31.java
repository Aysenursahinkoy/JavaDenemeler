package Bolum5;

import java.util.Scanner;

public class Soru31 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("yatirilacak miktar=");
		double miktar=input.nextDouble();
		System.out.println("faiz orani nedir=");
		double faiz=input.nextDouble();
		System.out.println("sure ne kadar=");
		double sure=input.nextDouble();
		
		double faizTutari=miktar*faiz/1200;
		double formul=miktar+faizTutari;
		for (int i = 0; i < sure; i++) {
			
		}
	}
}
