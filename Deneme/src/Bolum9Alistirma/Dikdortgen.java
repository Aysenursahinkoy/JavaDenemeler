package Bolum9Alistirma;

public class Dikdortgen {
	double yukseklik;
	double genislik;
	
	Dikdortgen(){
		
	}
	Dikdortgen(double yukseklik,double genislik){
		this.yukseklik=yukseklik;
		this.genislik=genislik;
	}
	double getArea(){
		return yukseklik*genislik;
	}
	
	double getPerimeter(){
		return (yukseklik+genislik)*2;
	}
}
