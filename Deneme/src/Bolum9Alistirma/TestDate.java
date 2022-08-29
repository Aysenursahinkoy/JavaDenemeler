package Bolum9Alistirma;

public class TestDate {
	
	public static void main(String[] args) {
		
		Date date1=new Date();
		
		long elapsedTime=10_000;
		final long lastTime=100_000_000_000L;
		
		for (long i = elapsedTime; i <= lastTime; i*=10) {
			date1.setTime(i);
			System.out.println(date1.toString());
		
		}
	}
}
