package Bolum8;

import java.util.Scanner;

public class PassTwoDimensionalArray {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[][] m=new int[3][4];
		System.out.println("toplam "+m.length+" satir ve "+m[0].length+" sutun");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=input.nextInt();
				
			}
		}
		System.out.println("\nSum of all elements is"+sum(m));
	}

	public static int sum(int[][] m) {
		int total=0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				total+=m[i][j];
			}
		}
		return total;
	}
}
