package Bolum3;

import java.util.Scanner;

public class RastgeleAy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1-12 arasi bir sayi giriniz:");
		int ay=input.nextInt();
		if(ay==1){
			System.out.println("ocak");
		}
		else if(ay==2){
			System.out.println("subat");
		}
		else if(ay==3){
			System.out.println("mart");
		}
		else if(ay==4){
			System.out.println("nisan");
		}
		else if(ay==5){
			System.out.println("mayis");
		}
		else if(ay==6){
			System.out.println("haziran");
		}
		else if(ay==7){
			System.out.println("temmuz");
		}
		else if(ay==8){
			System.out.println("agustos");
		}
		else if(ay==9){
			System.out.println("eylul");
		}
		else if(ay==10){
			System.out.println("ekim");
		}
		else if(ay==11){
			System.out.println("kasim");
		}
		else if(ay==12){
			System.out.println("aralik");
		}
		else{
			System.out.println("yanlis deger");
		}
	}
}
