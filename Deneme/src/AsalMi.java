
public class AsalMi {
	public static void main(String[] args){
		int sayac=0;
		int sayi=2;
		while(sayac<50){
			boolean asalMi=true;
			for (int i = 2; i < sayi; i++) {
				if(sayi%i ==0){
					asalMi=false;
				}
			}
			if(asalMi==true){
				sayac++;
				System.out.printf("\n %2d.asal sayi %2d",sayac,sayi);
			}
			sayi++;
		}
	}
}
