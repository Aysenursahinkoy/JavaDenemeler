import java.util.Scanner;

public class SayiTahminOyunu {
	public static void main(String[] args){
		Scanner klavye=new Scanner(System.in);
		
		int sayi=(int)(Math.random()*101);
		int tahmin=-1;
		int kac=5;
		while(sayi != tahmin ){
			System.out.println("0 ile 101 arasýnda bir sayý giriniz: ");
			tahmin=klavye.nextInt();
			kac--;
			
			
			if(sayi > tahmin){
				if(kac==0){
					System.out.println("deneme hakkýnýz bitti dogru sayi :"+sayi);
					break;
				}
				System.out.println("daha büyük bir sayi giriniz. kalan deneme hakkýnýz : "+kac);
				
			}
			else if(sayi < tahmin){
			  if(kac==0){
				System.out.println("deneme hakkýnýz bitti dogru sayi : "+sayi);
				  break;
			  }
				System.out.println("daha kücük bir sayý giriniz. kalan deneme hakkýnýz : "+kac);

			}
			
			else{
				System.out.println("tebriklerrr bildiniz dogru sayý ....."+sayi);
			}
			
			
		}
		
		
	}
} 
