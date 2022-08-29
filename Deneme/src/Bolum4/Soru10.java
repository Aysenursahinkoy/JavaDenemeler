package Bolum4;

import java.util.Scanner;

public class Soru10 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Harf girniz:");
		char harf=input.next().charAt(0);
		System.out.println("karakterin ASCII kodu karsiligi="+harf+" "+(int)harf);
	}
}
