package alistirma;

import java.util.Scanner;

public class birlesikFaiz {
	public static void main(String[] args){
		Scanner  klavye=new Scanner(System.in);
		
		System.out.println("aylik bankaya yatiracaginiz tutar miktari: ");
		double tutar=klavye.nextDouble();
		
		double birinciAy=tutar*(1.00417);
		double ikinciAy=(tutar+birinciAy)*(1.00417);
		double ucuncuAy=(tutar+ikinciAy)*(1.00417);
		double dorduncuAy=(tutar+ucuncuAy)+(1.00417);
		double besinciAy=(tutar+dorduncuAy)+(1.00417);
		double altinciAy=(tutar+besinciAy)+(1.00417);
		
	
		System.out.println("hesabinizda 6 ay sonunda güncel durum : "+altinciAy+" Tl dir.");
		
		
	}
}
