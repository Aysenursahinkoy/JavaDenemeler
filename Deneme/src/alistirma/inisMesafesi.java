package alistirma;

import java.util.Scanner;

public class inisMesafesi {
	public static void main(String[] args){
		
		Scanner klavye=new Scanner(System.in);
		System.out.println("ucagin ivmesini giriniz :");
		double a=klavye.nextDouble();
		System.out.println("ucagin inis anindak, hizi : ");
		double v=klavye.nextDouble();
		
		double l=(v*v)/(2*a);
		double m=l*1000;
		
		System.out.println("ucagin inis mesafesi : "+(((int)m)*0.001)+" dir.");
	
	}
}
