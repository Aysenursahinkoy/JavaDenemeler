package Bolum6;

public class Soru1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

			System.out.printf("%4s ",(i%10!=0)? getPentagonalNumber(i)+" ":getPentagonalNumber(i)+"\n");

		}

	}

	public static int getPentagonalNumber(int n) {

		

		return  (3 * n - 1) / 2;
	}

}
