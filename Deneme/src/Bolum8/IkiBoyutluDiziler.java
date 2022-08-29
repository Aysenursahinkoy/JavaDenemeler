package Bolum8;

public class IkiBoyutluDiziler {
	public static void main(String[] args) {
		int[][] dizi = new int[5][5];
		dizi[3][4] = 7;
		dizi[4][3] = 9;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j] + " ");

			}
			System.out.println();

		}
		int[][] x = new int[3][];

		x[0] = new int[4];
		x[1] = new int[4];
		x[2] = new int[4];

		int[][] y = new int[3][];
		y[0] = new int[4];
		y[1] = y[0];
		y[2] = y[0];
		
		y[0][2]=5;
		System.out.println(y[2][2]);//5 yazar cunku su an hepsi ayni yeri gosteriyor
		System.out.println(y[1][2]);//5 yazar cunku su an hepsi ayni yeri gosteriyor
		System.out.println(y[0][2]);//5 yazar cunku su an hepsi ayni yeri gosteriyor
		
	}
}
