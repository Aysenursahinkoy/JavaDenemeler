package Metodlar;

public class MethodParametreGonderme {
	public static void main(String[] args) {
		int s1=5;
		int s2=8888;
		System.out.println("degistirmeden once s1: "+s1+" s2: "+s2);
		 swap(s1,s2);
		 System.out.println("degistirirdikten sonra s1: "+s1+" s2: "+s2);
	}

	public static void swap(int sayi1,int sayi2) {
		System.out.println("degistirmeden once sayi1: "+sayi1+" sayi 2:"+sayi2);
		int gecici=sayi1;
		sayi1=sayi2;
		sayi2=gecici;
		System.out.println("degistirdikten sonra sayi1: "+sayi1+" sayi2: "+sayi2);
	}
}
