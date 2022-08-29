package Bolum11;

public class CokBicimlilikOrnegi {
	public static void main(String[] args) {
		geometrikNesneYazdir(new Cember(5.0, "mavi", true));
		geometrikNesneYazdir(new Dikdortgen("siyah", false, 100, 40));
	}
	
	public static void geometrikNesneYazdir(GeometrikNesne gn){
		System.out.println("olusturulma tarihi : "+gn.getOlusturulmaTarihi()
		+ " Renk : "+gn.getRenk() + " dolu mu ?" +  gn.isDolu());
		System.out.println();
		System.out.println(gn.toString());
	}
}
