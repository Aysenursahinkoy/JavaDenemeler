package Metodlar;

import java.util.Scanner;

public class ObebMethodKendiYazdigim {
	public static void main(String[] args) {
		
		Scanner k=new Scanner(System.in);
		System.out.println("1.sayi: ");
		int sayi1=k.nextInt();
		System.out.println("2.sayi: ");
		int sayi2=k.nextInt();
		
		int obeb=obeb(sayi1,sayi2);
		int okek=okek(sayi1,sayi2,obeb);
		System.out.println(sayi1+" ve "+sayi2+" nin obebi: "+obeb+" okeki: "+okek+" dir");
	}

	private static int okek(int sayi1, int sayi2 , int obeb) {
		int ekok=(sayi1*sayi2)/obeb;
		return ekok;
	}

	private static int obeb(int sayi1,int sayi2) {
		int bolen=2;
		int obeb=0;
		while(bolen<=sayi2 && bolen<=sayi1){
			
			if(sayi2 % bolen ==0 && sayi1 % bolen == 0){
				obeb = bolen; //burada bolen = obeb; dedim ve hata aldim.
			}
			bolen++;
		}
		return obeb;
	}
}
