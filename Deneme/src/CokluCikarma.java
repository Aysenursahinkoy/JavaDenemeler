import java.util.Scanner;

public class CokluCikarma {
public static void main(String[] args){
	Scanner klavye=new Scanner(System.in);
	System.out.println("toplanacak say�y� giriniz (c�k�s i�in 0 s�f�r bas�n�z ) : ");
	int sayi=klavye.nextInt();
	int toplam=0;
	while(sayi != 0){
		toplam += sayi;
		System.out.println("toplanacak say�y� giriniz (c�k�s i�in 0 s�f�r bas�n�z ) : ");
		sayi=klavye.nextInt();
		
	}
	System.out.println("toplam : "+toplam);
	//bu kodda kullan�c� 0 girmedigi s�rece kod tekrar eder.
}
}
