package Bolum5;

import java.util.Scanner;

public class Soru22 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 System.out.printf("bakiye giriniz: ");
	        double bakiye = input.nextDouble();

	        System.out.print("Number of Years: ");
	        int yil = input.nextInt();

	        System.out.print("yillik faiz orani giriniz ( orn: 8.25): ");
	        double faiz = input.nextDouble();
		
		 double aylikFaiz = faiz/1200;

	        double aylikOdeme = bakiye*aylikFaiz / (1 - (Math.pow(1 / (1 + aylikFaiz), yil * 12)));
	        double balance = bakiye;
	        double faizOrani;
	        double ana;

	        System.out.println("aylik odeme: " + (int)(aylikOdeme * 100) / 100.0 );
	        System.out.println("Toplam odeme: " + (int)(aylikOdeme * 12 * yil * 100) / 100.0 + "\n" );

	        System.out.println("odeme#\tfaiz\tanaPara\tbalance");
	        for (int i = 1; i <= yil * 12; i++) {
	            faizOrani = (int)(aylikFaiz * balance * 100) / 100.0;
	            ana = (int)((aylikOdeme - faizOrani) * 100) / 100.0;
	            balance = (int)((balance - ana) * 100) / 100.0;
	            System.out.println(i + "\t\t\t" + faizOrani + "\t\t" + ana + "\t\t" + balance);
	        }
		
		
	}
}
