package Bolum10Alistirma;

import java.util.Date;

public class Time {
	private int hour;
	private int munite;
	private int second;
	private Date time;
	private long total;

	public Time() {
		time = new Date();
	}

	public Time(long total) {
		total = System.currentTimeMillis();

	}

	Time(int hour, int munite, int second) {
		this.hour = hour;
		this.munite = munite;
		this.second = second;

	}

	public String  setTime(long total) {

		long toplamdakika = total / 60;
		long anlikdakika = (int) (toplamdakika % 60);
		long toplamsaat = toplamdakika / 60;
		long anliksaat = (int) (toplamsaat % 24);
		return anliksaat + " ; "+ anlikdakika + " : "+ anlikdakika + " ";
	}

	public int getHour() {

		return hour;
	}

	public int getMunite() {
		return munite;
	}

	public int getSecond() {
		return second;
	}

}
