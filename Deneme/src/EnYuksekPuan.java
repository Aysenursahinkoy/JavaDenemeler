import java.util.Scanner;

public class EnYuksekPuan {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("toplam ogrenci sayisini giriniz : ");
		int toplam=input.nextInt();
		int enYuksekPuan=0;
		String enYuksekPuanliOgrenci="";
		for (int a = 0; a < toplam; a++) {
			System.out.print("Ogrenci "+(a+1)+": \nAdi: ");
			String ad=input.next();
			System.out.print("Puan: ");
			int puan=input.nextInt();
			if(puan>enYuksekPuan){
				enYuksekPuan=puan;
				enYuksekPuanliOgrenci=ad;
				
			}
			
			
			}
		System.out.println("en yuksek puanli ogrenci:"+enYuksekPuanliOgrenci);
}
}


	
	
	

