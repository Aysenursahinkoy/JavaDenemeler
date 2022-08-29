package Bolum10;

import java.math.*;

//import java.lang bu sinif otomatik import edilir
public class SarmallayiciSiniflar {

	public static void main(String[] args) {
		System.out.println(new Double(12.4).intValue());//12
		
		//int j=Integer.parseInt("ayse");
		int i=Integer.parseInt("1234");
		
		Integer io=Integer.valueOf("899123456");
		System.out.println(io);
		//System.out.println(j);//hata verir string veri tipinden dolayi
		System.out.println(i);
		int x=Integer.parseInt("1A",16);
		
		System.out.println(x);
		System.out.println( String.format("%x", 26));
		
		
		//java 1.5 ten sonra gelen ozellik
		
		// primitive tip ile nesneye atama yaptik
		io=5; //io=new Integer(5); bunu buna cevirdi buna autoboxing denir 
		//nesneyi primitive tipe atadik io=nesne
		i=io;//buna da autounboxing denir
		
		String s ="java";
		
		
		//*****************BigInteger***********************// 
		
		BigInteger bi1=new BigInteger(i+"");// "" bunu koymamin nedeni icine sadec "5" gibi deger verebiliyor olmamiz
		
		BigInteger bi2=new BigInteger(String.valueOf(i));//bunuda yapabiliriz ama usttekini yap
		//eger objeyi yazdirmak istersek
		BigInteger bio=new BigInteger(io.toString());
		
		//boyle yaparsak 5 yazamya devam eder cunku objenin kenidisi degismez immutabledir degistirilemez
		bi1.multiply(bi2);//carp demek
		System.out.println(bi1);
		
		//bunu yaparsak 25 yazar yeni bir bigInteger olusturduk
		BigInteger bi3=bi1.multiply(bi2);
		System.out.println(bi3);
		//bi1 referansina yeni bir nesne atiyarak tanimliyorum
		bi1=new BigInteger("12345678987675643234234545345464556455645");
		//neden boyle bir sayi verdim cunku siniri yok sinir pc dir
		bi1=bi1.multiply(new BigInteger("5"));//burada carpma islemi yaptik
		System.out.println(bi1);
		
		
		BigDecimal a = new BigDecimal(1.0);
		BigDecimal b = new BigDecimal(3);
		BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);
		
		System.out.println(c);
	}
}
