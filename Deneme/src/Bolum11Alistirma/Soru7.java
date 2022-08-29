package Bolum11Alistirma;

import java.util.ArrayList;

public class Soru7 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 20; i++) {
			 list.add((int)(Math.random()*100));
			
		}
		 System.out.print(list);
		System.out.println();
		java.util.Collections.shuffle(list);
		System.out.print(list);
	}
}
