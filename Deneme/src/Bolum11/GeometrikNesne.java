package Bolum11;

import java.util.Date;

public class GeometrikNesne {
	private String renk;
	private boolean dolu;
	private Date olusturulmaTarihi;
	
	public GeometrikNesne(){
		renk="Beyaz";
		olusturulmaTarihi=new Date();
		
	}
	public GeometrikNesne(String renk,boolean dolu){
		this();
		this.renk=renk;
		this.dolu=dolu;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public boolean isDolu() {
		return dolu;
	}
	public void setDolu(boolean dolu) {
		this.dolu = dolu;
	}
	public Date getOlusturulmaTarihi() {
		return olusturulmaTarihi;
	}
	public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
		this.olusturulmaTarihi = olusturulmaTarihi;
	}
	/*
	 * merhaba 
	 * @return string donuyo iste
	 */
	@Override
	public String toString(){
		return "olusturulmaTarihi:" + olusturulmaTarihi + "\nRenk: "+ renk + "dolu mu ?" +dolu;
		
	}
	public static void foo(){
		
	}
	public void yazdir(){
		
	}
}
