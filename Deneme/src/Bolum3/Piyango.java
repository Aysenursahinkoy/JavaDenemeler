package Bolum3;

import java.util.Scanner;

public class Piyango {
	public static void main(String[] args) {
		int piyango=347;
		int yuzlerBasamagi=piyango/100;
		int onlarBasamagi=(piyango%100)/10;
		int birlerBasamagi=piyango%10;
		Scanner input=new Scanner(System.in);
		System.out.print("tahmininizi giriniz=");
		int tahmin=input.nextInt();
		int yuzlerBasamagiT=tahmin/100;
		int onlarBasamagiT=(tahmin%100)/10;
		int birlerBasamagiT=tahmin%10;
		if(tahmin==piyango){
			System.out.println("tebrikler 10.000 TL kazandiniz ");
		}
		else if(yuzlerBasamagi==yuzlerBasamagiT&&onlarBasamagi==birlerBasamagiT&&birlerBasamagi==onlarBasamagiT 
				|| yuzlerBasamagi==onlarBasamagiT && onlarBasamagi==birlerBasamagiT && birlerBasamagi== yuzlerBasamagiT
				|| yuzlerBasamagi==birlerBasamagiT && onlarBasamagi==yuzlerBasamagiT && birlerBasamagi==onlarBasamagiT 
				|| yuzlerBasamagi==birlerBasamagiT && onlarBasamagi==onlarBasamagiT&& birlerBasamagi==yuzlerBasamagiT
				|| yuzlerBasamagi==onlarBasamagiT&& onlarBasamagi==yuzlerBasamagiT&& birlerBasamagi==birlerBasamagiT){
			System.out.println("3.000 TL kazandiniz dogru tahmin = "+piyango);
		}
		else if(yuzlerBasamagi==yuzlerBasamagi || onlarBasamagi==onlarBasamagiT || birlerBasamagi==birlerBasamagiT 
				|| yuzlerBasamagi==onlarBasamagiT || yuzlerBasamagi==birlerBasamagiT || onlarBasamagi==yuzlerBasamagiT 
				|| onlarBasamagi==birlerBasamagiT ||birlerBasamagi ==onlarBasamagiT || birlerBasamagiT==yuzlerBasamagiT){
			System.out.println("tebrikler 1.000 TL kazandiniz dogru tahmin = "+piyango);
		}
	}
}
