import java.util.Scanner;

public class Hexadecimals {
	public static void main(String[] args){
		Scanner k=new Scanner(System.in);
		System.out.println("bir tam sayi giriniz  :");
		int tamsayi=k.nextInt();
		String hexSayi = "";
		
		int kalan = tamsayi;
		while(kalan>0){
			int basamak = kalan % 16;
			if(basamak<10){
				hexSayi= basamak+hexSayi;
				
			}
			else{
				hexSayi =(char)'A'+ (basamak-10)+hexSayi;
			}
			kalan /= 16;
			
		}
		System.out.println(tamsayi+" tam sayisinin hex e cevrilmis hali : "+hexSayi+"dir");
	}
}
