package Bolum8;

import java.util.Scanner;

public class EnYakinIkiNoktayiBulma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("kac nokta gireceksiniz: ");
		int noktaSayisi = input.nextInt();
		double[][] noktalar = new double[noktaSayisi][2];
		for (int i = 0; i < noktaSayisi; i++) {
			noktalar[i][0] = input.nextDouble();
			noktalar[i][1] = input.nextDouble();

		}
		
		double enkucukMesafe=Double.MAX_VALUE;
		int p1=-1;
		int p2=-1;
		for (int i = 0; i < noktalar.length-1; i++) {
			for (int j = i+1; j < noktalar.length; j++) {
				
				double mesafe=mesafeHesapla(noktalar[i][0], noktalar[i][1],noktalar[j][0],noktalar[j][1]);
			
				if (enkucukMesafe>mesafe) {
					enkucukMesafe=mesafe;
					p1=i;
					p2=j;
				}
			}
		}
		System.out.println("birbirine en yakin iki nokta ("+noktalar[p1][0]+", "+ noktalar[p1][1]+")  ve ( "
		+ noktalar[p2][0]+", "+ noktalar[p2][1]+") dir");
		
	}

	public static double mesafeHesapla(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
