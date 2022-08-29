package Diziler;

import java.util.Scanner;

public class OrtalamanýnUstundekýlerýGoster {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		System.out.println("ortlamana alinmasi icin kac sayi girmek istiyorsunuz : ");
		int donguSayisi=input.nextInt();
		int toplam=0;
		double[] dizi=new double[donguSayisi];
		for (int i = 0; i < donguSayisi; i++) {
			System.out.println("lutfen bir sayi giriniz: ");
			dizi[i]=input.nextDouble();
			toplam+=dizi[i];
		}
		double ortalama=toplam/donguSayisi;
		System.out.println("ortalama : "+ortalama);
		
		int ortalamadanBuyukSayac=0;
		for (int i = 0; i < dizi.length; i++) {
			if(dizi[i]>ortalama){
				ortalamadanBuyukSayac++;
			}
		}
		System.out.println(ortalamadanBuyukSayac+" tane sayi ortalamadan buyuktur");
	
	}
}
