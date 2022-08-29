package Metodlar;

public class StackOverFlow {
	public static void main(String[] args) {
		method(0);
	}

	private static void method(int sayac) {
		// TODO Auto-generated method stub
		if(sayac==1000){
			return;
			//sayac 1000 olunca dursun dememizin nedeni stack overflow olmamasi yani tasmasin)
		}
		sayac++;
		System.out.println(sayac);
		method(sayac);
		//method kendi kendini cagirdi buna recursive method (ya kendi kendilerini cagrirlar ya da bir yerde dururlar) denir ve stackover olu
	}
}
