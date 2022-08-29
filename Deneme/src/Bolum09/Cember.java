package Bolum09;

public class Cember {
	double yariCap=10;
	//ilk 10 olur deger sonra 5 yani construct dan once calisir.
	
	static int nesneSayisi;
	
	Cember(){
		yariCap=5;
		nesneSayisi++;
	}
	Cember(double y){
		yariCap=y;
		nesneSayisi++;
	}


	double alanHesapla(){
		return Math.pow(yariCap, 2)*Math.PI;
	}
	double cevreHesapla(){
		return Math.PI*yariCap*2;
	}
	void yariCapGuncelle(double y){
		yariCap=y;
	}
}
