package Bolum9Alistirma;
import java.util.GregorianCalendar;

public class Soru5 {
	public static void main(String[] args) {
		GregorianCalendar g1=new GregorianCalendar();
		System.out.println(g1.getTime());
		
		System.out.println(g1.get(GregorianCalendar.YEAR));
		System.out.println(g1.get(GregorianCalendar.MONTH));
		System.out.println(g1.get(GregorianCalendar.DAY_OF_MONTH));
		
		g1.setTimeInMillis(1234567898765L);
		
		System.out.println(g1.get(GregorianCalendar.YEAR));
		System.out.println(g1.get(GregorianCalendar.MONTH));
		System.out.println(g1.get(GregorianCalendar.DAY_OF_MONTH));
	}
	
}
