package alistirma;

import java.util.Scanner;

public class enerjiHaesaplama {
	public static void main(String[] args){
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("su miktari giriniz(kg) : ");
		double su=klavye.nextDouble();
		System.out.println("baslangic sicaligi giriniz : ");
		double baslangic=klavye.nextDouble();
		System.out.println("hedeflenen sicakligi giriniz : ");
		double hedef=klavye.nextDouble();
		double enerji=su*(hedef-baslangic)*4184;
		System.out.println("joule cinsinden enerji miktari : "+enerji);
	}

}
