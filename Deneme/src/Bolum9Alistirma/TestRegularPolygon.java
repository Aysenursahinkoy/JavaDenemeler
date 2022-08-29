package Bolum9Alistirma;

public class TestRegularPolygon {
	public static void main(String[] args) {
		
		RegularPolygon r=new RegularPolygon();
		r.setX(6);
		r.setY(4);
		System.out.println("n="+r.getN()+" side ="+r.getSide());
		System.out.println("r icin cevre = "+r.getPerimeter()+" alan = "+r.getArea());
		
		RegularPolygon r2=new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println("n="+r2.getN()+" side ="+r2.getSide());
		System.out.println("r2 icin cevre = "+r2.getPerimeter()+" alan = "+r2.getArea());

	}
}
