package Bolum5;

public class Soru25 {
	public static void main(String[] args) {
		onBin();
		yirmiBin();
		otuzBin();
		yuzBin();
		
	}

	private static void yuzBin() {
		double toplam=0;
		for (int i = 1; i < 100_000; i++) {
			double a=Math.pow((-1), (i+1));
			double b=(2*i)-1;
			double c=a/b;
			toplam+=c;
		}
		System.out.println(4*toplam);
	}

	private static void otuzBin() {
		double toplam=0;
		for (int i = 1; i < 30_000; i++) {
			double a=Math.pow((-1), (i+1));
			double b=(2*i)-1;
			double c=a/b;
			toplam+=c;
		}
		
		System.out.println((4*toplam));
	}

	private static void yirmiBin() {
		double toplam=0;
		for (int i = 1; i < 20_000; i++) {
			double a=Math.pow((-1), (i+1));
			double b=(2*i)-1;
			double c=a/b;
			toplam+=c;
		}
		System.out.println(4*toplam);
	}

	private static void onBin() {
		double toplam=0;
		for (int i = 1; i < 10_000; i++) {
			double a=Math.pow((-1), (i+1));
			double b=(2*i)-1;
			double c=a/b;
			toplam+=c;
		}
		System.out.println(4*toplam);
	}
}
