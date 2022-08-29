package alistirma;

import java.util.Scanner;

public class alistirma2 {
	public static void main(String[] args){
		Scanner klavye= new Scanner(System.in);
		System.out.println("bir sayi girin :");
		double sayi = klavye.nextDouble();
		double f=((9.0/5)*sayi)+32;
		System.out.println(f);
		
		
		System.out.println("silinirin yaricapi : ");
		double r=klavye.nextDouble();
		System.out.println("silindirin yuksekligi : ");
		double h =klavye.nextDouble();
		
		double alan=r*r*Math.PI;
		double hacim=alan*h;
		System.out.println("silinirin alani : "+alan+" silindirin hacmi : "+hacim);
		
		System.out.println("bir feet degeri girin : ");
		double feet = klavye.nextDouble();
		double birmetre=0.305;
		double metre=birmetre*feet;
		System.out.println(metre);
		
		
		System.out.println("pound degeri gir : ");
		double pound=klavye.nextDouble();
		
		double birkg=0.454;
		double kg=birkg*pound;
		System.out.println(kg);
		
	}
}
