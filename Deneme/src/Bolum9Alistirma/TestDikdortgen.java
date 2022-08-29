package Bolum9Alistirma;

public class TestDikdortgen {
	public static void main(String[] args) {
		Dikdortgen d1=new Dikdortgen();
		
		d1.genislik=4;
		d1.yukseklik=40;

		Dikdortgen d2=new Dikdortgen(3.5,35.9);
		
		
		
		System.out.println("1. dikdortgenin alani = "+d1.getArea()+" ve cevresi = "+d1.getPerimeter());
		System.out.println("2. dikdortgenin alani = "+d2.getArea()+" ve cevresi = "+d2.getPerimeter());
		
	}
}
