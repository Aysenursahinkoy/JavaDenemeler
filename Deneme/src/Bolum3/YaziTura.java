package Bolum3;

import java.util.Scanner;

public class YaziTura {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("tahmini giriniz 1(tura) ya da 0(yazi) ");
		int tahmin=input.nextInt();
		int random=(int)(Math.random()*2);
		if(tahmin==random){
			System.out.println("true");
			
		}
		else{
			System.out.println("false dogru olan="+random);
		}
		
	}
}
