package bolum12;

public class Test {
	public static void main(String[] args) {
		//System.out.println(1/0);//burada  java.lang.ArithmeticException harasi aliyorum
		System.out.println(1.0/0);//burada hata almiyorum Infinity yaziyor(sonsuzluk)
		System.out.println(0.0/0);//NaN yaziyor
		//bunlar double dan kaynakliu ozellikler 
		
		long value= Long.MAX_VALUE+1;
		System.out.println(value);
	//hata firlatmaz tasar sacma sayi yazar
	}
}
