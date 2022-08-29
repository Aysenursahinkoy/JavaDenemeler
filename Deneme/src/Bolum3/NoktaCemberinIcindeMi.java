package Bolum3;

import java.util.Scanner;

public class NoktaCemberinIcindeMi {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("noktalari giriniz:");
		int x=input.nextInt();
		int y=input.nextInt();
		int a=x*x+y*y;
		if(a<100){
			System.out.println("cemberin icinde");
		}
		else{
			System.out.println("cemberin disinda");
		}
	}
}
