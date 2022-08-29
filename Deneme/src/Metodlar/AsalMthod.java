package Metodlar;

import java.util.Scanner;
//ilk 1000  asal sayi method ile
public class AsalMthod {
	public static void main(String[] args) {
		int sayac=0;
		int sayi=2;
		while(sayi<1000){
			if(asalMi(sayi)){
				System.out.printf("%4d",sayi);
				sayac++;
				if(sayac%10==0){
					System.out.println();
				}
			}
			sayi++;
		
		}
	}
	public static boolean asalMi(int s){
		for (int i = 2; i < s; i++) {
			if(s%i==0){
				return false;
			}
		}
		return true;
	}
}
