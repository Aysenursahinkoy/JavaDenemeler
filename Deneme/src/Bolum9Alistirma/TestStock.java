package Bolum9Alistirma;

public class TestStock {
	public static void main(String[] args) {
		Stock s1=new Stock("ORCL","Oracle Corporation",34.5);
		
		s1.currentPrice=34.35;
		
		
		System.out.println("price-change percentage = "+s1.getChangePercent());
	}
}
