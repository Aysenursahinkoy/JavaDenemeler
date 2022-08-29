package alistirma;

public class showCurrentTime {
	public static void main(String[] args){
		long totalMilliseconds = System.currentTimeMillis();
		long totalseconds = totalMilliseconds/1000;
		long currentseconds=totalseconds%60;
		long totalMinnutes=totalseconds/60;
		long currentminnutes=totalMinnutes%60;
		long totalhours=totalMinnutes/60;
		long currenthour=totalhours%24;
		System.out.println("su an ki zaman : "+currenthour+" "+currentminnutes+" "+currentseconds+" GMT dir.");
		System.out.println("TÜRKÝYE þu an ki saat "+(currenthour+3)+" "+currentminnutes+" "+currentseconds+" dir.");
		
	}
}
