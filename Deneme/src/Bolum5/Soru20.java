package Bolum5;

public class Soru20 {
	public static void main(String[] args) {
	
		int sayi=2;
		while(sayi<1000){
			boolean asalMi=true;
			for (int i = 2; i < sayi; i++) {
				if(sayi%i ==0){
					asalMi=false;
				}
			}
			if(asalMi==true){
			
				System.out.printf(" %2d",sayi);
			}
			sayi++;
		}
				
	
	}
}
