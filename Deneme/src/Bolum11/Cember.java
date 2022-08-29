package Bolum11;

public class Cember extends GeometrikNesne {
	private double yaricap;

	public Cember() {
		super();

	}
	public Cember(double yaricap){
		this.yaricap=yaricap;
	}
	
	public Cember(double yaricap,String renk,boolean dolu){
		super(renk,dolu);
		this.yaricap=yaricap;
		
	}
	public double alanHesapla(){
		return yaricap*yaricap*Math.PI;
	}
	public double cevreHesapla(){
		return 2*yaricap*Math.PI;
	}
	public double getCap(){
		return 2*yaricap;
		
	}
	@Override
	public void yazdir(){
		System.out.println(super.getOlusturulmaTarihi()+" tarihinde olusturuldu ve yaricapi : "+yaricap);
	}
	
	public String toString(){
		return super.toString()+" yaricap : "+yaricap;
		
	}

	public double getYaricap() {
		return yaricap;
	}

	public void setYaricap(double yaricap) {
		this.yaricap = yaricap;
	}
	
	public static void foo(){
		GeometrikNesne.foo();
	}
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof Cember))
			return false;
		Cember other =(Cember) obj;
		if(Double.doubleToLongBits(yaricap) != Double.doubleToLongBits(other.yaricap) || !getRenk().equals(other.getRenk()))
			return false;
		return true;
	}
	
}
