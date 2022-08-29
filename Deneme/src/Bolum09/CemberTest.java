package Bolum09;

public class CemberTest {
	
	public static void main(String[] args) {
		Cember cember1=new Cember();
		cember1.yariCap=(59.67);
		System.out.println(cember1.alanHesapla());
		
		Cember cember2=new Cember();
		cember1.yariCapGuncelle(1);
	
		System.out.println(cember2.alanHesapla());
		//0 yazdirir cunku 1. objenin yari capini 1 yaptik ve sonra cember2 yi cagirdik
		
		cember2.yariCapGuncelle(1);
		System.out.println(cember2.alanHesapla());
	}
		
}
