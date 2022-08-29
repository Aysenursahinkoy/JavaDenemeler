package Metodlar;

import java.util.Scanner;

public class AsalSayiMethodKullaniciBelirlesin {
	public static void main(String[] args) {
		Scanner k=new Scanner(System.in);
		System.out.print("kac sayi:");
		int sayiK=k.nextInt();
		int sayac=0;
		int sayi=2;
		while(sayi<sayiK){
			if(asalMi(sayi)){
				System.out.println(sayi);
				sayac++;
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
