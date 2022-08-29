package Bolum3;

import java.util.Scanner;

public class BirAyinGunSayisi {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ay giriniz=");
		int ay=input.nextInt();
		System.out.println("yil giriniz=");
		int yil=input.nextInt();
		if(ay==2){
			if((yil%4)==0){
				System.out.println("subat "+yil+" 29 gundur");
			}
			else {
				System.out.println("subat "+yil+" 28 gundur");
				
			}
		}
		else if(ay==1){
			System.out.println("ocak "+yil+" 31 gundur");
			
		}
		else if(ay==3){
			System.out.println("mart "+yil+" 31 gundur");

			
		}
		else if(ay==4){
			System.out.println("nisan "+yil+" 30 gundur");

		}
		else if(ay==5){
			System.out.println("mayis "+yil+" 31 gundur");

		}
		else if(ay==6){
			System.out.println("haziran "+yil+" 30 gundur");

		}
		else if(ay==7){
			System.out.println("temmuz "+yil+" 31 gundur");

		}
		else if(ay==8){
			System.out.println("agustos "+yil+" 31 gundur");

		}
		else if(ay==9){
			System.out.println("eylul "+yil+" 30 gundur");

		}
		else if(ay==10){
			System.out.println("ekim "+yil+" 31 gundur");

		}
		else if(ay==11){
			System.out.println("kasim "+yil+" 30 gundur");

		}
		else if(ay==12){
			System.out.println("aralik "+yil+" 31 gundur");

		}
		else{
			System.out.println("yanlis giris");
		}

		}
	}
