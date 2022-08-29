package Bolum10;

public class VKI {
	private String name;
	private int yas;
	private double kilo;
	private double boy;
	private double vki;
	private String durum;
	public VKI(String name, int yas, double kilo, double boy) {
		this.name = name;
		this.yas = yas;
		this.kilo = kilo;
		this.boy = boy;
		this.vki=kilo/(boy*boy);
		this.durum=durumBul();
	}
	public VKI(String name, double kilo, double boy) {
		this(name, 20, kilo, boy);
	}
	/**
	 * Use getVki()
	 *@see getVki(
	 */
	@Deprecated
	double vkiHesapla(){
		return vki;
	}
	
	public double getVki() {
		return vki;
	}
	private String durum(){
		return durum;
	}
	public String durumBul(){
		double vki=vkiHesapla();
		if(vki<18.5){
			return "cok zayif";
		}
		else if(vki<25){
			return "normal";
		}
		else if(vki<30){
			return "kilolu";
		}
		else{
			return "obez";
		}
	}
	public String getName() {
		return name;
	}
	public int getYas() {
		return yas;
	}
	public double getKilo() {
		return kilo;
	}
	public double getBoy() {
		return boy;
	}
}
