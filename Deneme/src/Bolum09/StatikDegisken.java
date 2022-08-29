package Bolum09;

public class StatikDegisken {
	public static void main(String[] args) {
		System.out.println(Cember.nesneSayisi);
		
		Cember c1=new Cember();//bu noktada nesne yaratildi.
		
		System.out.println(Cember.nesneSayisi);
	}
}
