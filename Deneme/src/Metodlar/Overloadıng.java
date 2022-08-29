package Metodlar;

public class Overloadıng {
	public static void main(String[] args) {
		double d1=5.67;
		double d2=23.99;
		double max=max(d1,d2);
		System.out.println(max);
		int m=(int)max(5,89);//bunu yapip tur donusturebilirz ya da ayni isim ile bir method olusturuz.
		System.out.println(m);
		//overloading denmesinin sebebi bu 2 tane ayni method adi var ama parametre yapisi birbirinden farkli ayni parametre olursa ide izin vermez zaten ayni 2 method olur
		int a=max(8,21);
		System.out.println(a);
		System.out.println(max(9.5167,9.32,5.65));
	}
	public static double max(double sayi1,double sayi2,double sayi3){
		return max(max(sayi1,sayi2),sayi3);
	}
	public static int max(int sayi1,int sayi2){
		int max;
		if(sayi1>sayi2){
			max=sayi1;
				
		}else {
			max=sayi2;
		}
		return max;
	}

	public static double max(double sayi1,double sayi2) {
		double max;
		if(sayi1>sayi2){
			max=sayi1;
			
		}else {
			max=sayi2;
		}
		//max=(sayi1>sayi2) ? sayi1: sayi2; sayi1 sayi2 den buyukse sayi1 yaz degilse sayi2 yaz kisa yolu
		return max;
	}

}
