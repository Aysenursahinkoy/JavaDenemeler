import java.util.Scanner;

public class SayiTahminOyunu {
	public static void main(String[] args){
		Scanner klavye=new Scanner(System.in);
		
		int sayi=(int)(Math.random()*101);
		int tahmin=-1;
		int kac=5;
		while(sayi != tahmin ){
			System.out.println("0 ile 101 aras�nda bir say� giriniz: ");
			tahmin=klavye.nextInt();
			kac--;
			
			
			if(sayi > tahmin){
				if(kac==0){
					System.out.println("deneme hakk�n�z bitti dogru sayi :"+sayi);
					break;
				}
				System.out.println("daha b�y�k bir sayi giriniz. kalan deneme hakk�n�z : "+kac);
				
			}
			else if(sayi < tahmin){
			  if(kac==0){
				System.out.println("deneme hakk�n�z bitti dogru sayi : "+sayi);
				  break;
			  }
				System.out.println("daha k�c�k bir say� giriniz. kalan deneme hakk�n�z : "+kac);

			}
			
			else{
				System.out.println("tebriklerrr bildiniz dogru say� ....."+sayi);
			}
			
			
		}
		
		
	}
} 
