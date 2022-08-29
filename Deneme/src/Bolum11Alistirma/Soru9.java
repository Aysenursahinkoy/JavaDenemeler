package Bolum11Alistirma;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size = input.nextInt();
		
		ArrayList<Integer> row= new ArrayList<>();
		ArrayList<Integer> column= new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
				 row.add((int)(Math.random()*2));
				 column.add((int)(Math.random()*2));
				 System.out.println(row);
				 System.out.println(column);
			
		}
	
	}

}
