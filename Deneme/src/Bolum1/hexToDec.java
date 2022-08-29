package Bolum1;

import java.util.Scanner;

public class hexToDec {
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		System.out.println("bir sayi gir : ");
		String girdi = klavye.next();
		char ch = girdi.toLowerCase().charAt(0);
		int sayi = 0;
		if(girdi.length() !=1){
			System.err.println("tek karakter giriniz!");
			System.exit(0);
		}
		else if ('a' <= ch && ch<='f'){
			sayi= ch - 'a'+10;
		}
		else if('0' <= ch && ch <= '9'){
			sayi = ch - '0';
		}
		else{
			System.err.println("yanlis girdi");
			System.exit(0);
		}
		System.out.println("hex " + ch + "nin degeri "+ sayi);
	}
	

}
