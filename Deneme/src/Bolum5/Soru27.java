package Bolum5;

public class Soru27 {
	public static void main(String[] args) {
		int sayac=0;
		for (int i = 101; i < 2100; i++) {
			if(i%4==0){
				sayac++;
				System.out.printf(" %4d",i);
				if(i%10==0){
					
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("toplam artik yil= "+sayac);
	}
}
