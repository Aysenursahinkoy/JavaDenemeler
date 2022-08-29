package Diziler;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("bir yazi giriniz : ");
		String yazi= input.nextLine();
		
		char[] yaziDizisi=yazi.toCharArray();
		char[] yazininTersi=terseCevir(yaziDizisi);
		System.out.println("girdiginiz yazinin tersi :");
		System.out.println(yazininTersi);
		
	}
	public static char[] terseCevir(char[] yaziDizisi){
		char[] yazininTersi=new char[yaziDizisi.length];
		for (int i = 0, j= yazininTersi.length-1;i<yazininTersi.length; i++,j--) {
			yazininTersi[j]=yaziDizisi[i];
		}
		return yazininTersi;
	}
}
