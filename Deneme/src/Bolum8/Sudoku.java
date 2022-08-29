package Bolum8;

public class Sudoku {
	public static void main(String[] args) {
		int[][] sudoku = {
				{5, 3, 4, 6, 7, 8, 9, 1, 2},
				{6, 7, 2, 1, 9, 5, 3, 4, 8},
				{1, 9, 8, 3, 4, 2, 5, 6, 7},
				{8, 5, 9, 7, 6, 1, 4, 2, 3},
				{4, 2, 6, 8, 5, 3, 7, 9, 1},
				{7, 1, 3, 9, 2, 4, 8, 5, 6},
				{9, 6, 1, 5, 3, 7, 2, 8, 4},
				{2, 8, 7, 4, 1, 9, 6, 3, 5},
				{3, 4, 5, 2, 8, 6, 1, 7, 9}};
		
		if(gecerliBirSudokuCozumu(sudoku)){
			System.out.println("gecerli bir sudoku cozumudur");
		}else{
			System.out.println("gecerli olmayan bir sudoku cozumudur");
		}
	}

	public static boolean gecerliBirSudokuCozumu(int[][] sudoku) {
		if(gecerliSayiKontrol(sudoku)==false){
			return false;
		}
		if(satirKontrol(sudoku)==false){
			return false;
		}
		if(sutunKontrol(sudoku)==false){
			return false;
		}
		
		
		for (int i = 0; i < sudoku.length; i++) {
			boolean[] kontrol=new boolean[9];
			for (int j = 0; j < sudoku.length; j++) {
				kontrol[sudoku[i][j]-1]=true;
				for (boolean b : kontrol) {
					if(b ==false){
						return false;
					}
				}
			}
			for (int j = 0; j < sudoku.length; j++) {
				boolean[] kontrol1=new boolean[9];
				for (int i1 = 0; i1 < sudoku.length; i1++) {
					kontrol1[sudoku[i1][j]-1]=true;
					for (boolean b : kontrol1) {
						if(b ==false){
							return false;
						}
					}
				}
				return true;
			}
		}
		return false;


	}

	private static boolean sutunKontrol(int[][] sudoku) {
		for (int j = 0; j < sudoku.length; j++) {
			boolean[] kontrol=new boolean[9];
			for (int i = 0; i < sudoku.length; i++) {
				kontrol[sudoku[i][j]-1]=true;
				for (boolean b : kontrol) {
					if(b ==false){
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}

	private static boolean satirKontrol(int[][] sudoku) {
		for (int i = 0; i < sudoku.length; i++) {
			boolean[] kontrol=new boolean[9];
			for (int j = 0; j < sudoku.length; j++) {
				kontrol[sudoku[i][j]-1]=true;
				for (boolean b : kontrol) {
					if(b ==false){
						return false;
					}
				}
			}
			return true;
		
	}
		return false;
	}

	private static boolean gecerliSayiKontrol(int[][] sudoku) {
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
				if(sudoku[i][j]<1 || sudoku[i][j]>9){
					return false;
				}
			}
		}
		return true;
	}
}
