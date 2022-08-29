package Metodlar;

public class DegiskenBilinirlikAlani {
	public static void main(String[] args) {
		int a=10;
		if(a>5){
			int b=15;
			b=13;
			System.out.println(" if icinde b:"+b);
		}
		//b=5; b nin omru if blogunun icinde bitti erisemem.
		for (int i = 0; i < 1; i++) {
		//	j=4; erisemem cunku bir alt nlokta j tanimlandi.
			a++;
			System.out.println(" forun icinde a "+a);
			int j=5;
			System.out.println(" j tanimlandiktan sonra forun icinde j line 16 dan sonra"+j);
			j=4;//burda erisirim.
		}
		System.out.println("fordan sonra a:"+a);
		//System.out.println(b); bye burada erisemem
		//i+5; hata
	}
}
