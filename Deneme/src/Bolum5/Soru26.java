package Bolum5;

public class Soru26 {
	public static void main(String[] args) {
		onBin();
		yirmiBin();
		yuzBin();
	}

	private static void onBin() {
		double toplam=0;
		double fak=1;
		for (int i = 1; i < 10_000; i++) {
			fak = fak * i;
			double e=(1/fak);
			toplam =toplam+e;
		}
		System.out.println(1+toplam);
	}

	private static void yirmiBin() {
		double toplam=0;
		double fak=1;
		for (int i = 1; i < 10_000; i++) {
			fak = fak * i;
			double e=(1/fak);
			toplam =toplam+e;
		}
		System.out.println(1+toplam);
	}

	private static void yuzBin() {
		double toplam=0;
		double fak=1;
		for (int i = 1; i < 10_000; i++) {
			fak = fak * i;
			double e=(1/fak);
			toplam =toplam+e;
		}
		System.out.println(1+toplam);
	}
}
