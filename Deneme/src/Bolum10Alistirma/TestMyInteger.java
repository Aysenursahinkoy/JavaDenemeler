package Bolum10Alistirma;

public class TestMyInteger {
	public static void main(String[] args) {
		
		MyInteger a1 =new MyInteger(7);
		MyInteger a2=new MyInteger(7);
		MyInteger a3=new MyInteger(24);
		System.out.println("sayi 1= "+ a1.getValue()+ " isPrime = "+a1.isPrime()+" isEven = "+ a1.isEven()+ " isOdd = "+a1.isOdd());
		
		System.out.println("sayi 2= "+ a2.getValue()+ " isPrime = "+a2.isPrime()+" isEven = "+ a2.isEven()+ " isOdd = "+a2.isOdd());
	
		System.out.println("sayi 3= "+ a3.getValue()+ " isPrime = "+a3.isPrime()+" isEven = "+ a3.isEven()+ " isOdd = "+a3.isOdd());

		System.out.println("sayi 1 == sayi 2"+a1.equals(a2));
		System.out.println("sayi 1 == sayi 3"+a1.equals(a2));
		System.out.println("parse int 100 string value == "+MyInteger.parseInt("100"));
		System.out.println("parse int 150 char array value == "+MyInteger.parseInt("150".toCharArray()));
		
	}
}
