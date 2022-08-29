import java.util.Scanner;

public class Deneme2 {
	public static void main(String[] args){
		Scanner klavye=new Scanner(System.in);
		
		int psayi=0;
		int nsayi=0;
		double toplam=0;
		int sayi=-1;	
		while(sayi != 0){
			System.out.println("sayi : ");
			sayi=klavye.nextInt();
			if(sayi>0){
				
				psayi++;
				toplam=toplam+sayi;
			}
			else if(sayi<0){
				nsayi++;
				toplam=toplam+sayi;

			}
			else if(sayi==0){
				System.out.println("program bitti");
				break;
			}
		}
		if(sayi !=0){
		double ort=toplam/(nsayi+psayi);
		System.out.println("sayýlarýn toplamý :"+toplam+"sayýlarýn ortalamasý : "+ort);
		
		}
	}
}
