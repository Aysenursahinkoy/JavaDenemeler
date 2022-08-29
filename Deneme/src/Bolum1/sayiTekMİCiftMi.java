package Bolum1;

import java.util.Scanner;

public class sayiTekMÝCiftMi {
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		System.out.println("bir sayi gir");
		int sayi = klavye.nextInt();
		System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");
	}

}
