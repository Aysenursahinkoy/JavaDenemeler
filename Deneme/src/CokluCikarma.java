import java.util.Scanner;

public class CokluCikarma {
public static void main(String[] args){
	Scanner klavye=new Scanner(System.in);
	System.out.println("toplanacak sayýyý giriniz (cýkýs için 0 sýfýr basýnýz ) : ");
	int sayi=klavye.nextInt();
	int toplam=0;
	while(sayi != 0){
		toplam += sayi;
		System.out.println("toplanacak sayýyý giriniz (cýkýs için 0 sýfýr basýnýz ) : ");
		sayi=klavye.nextInt();
		
	}
	System.out.println("toplam : "+toplam);
	//bu kodda kullanýcý 0 girmedigi sürece kod tekrar eder.
}
}
