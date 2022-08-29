package Bolum11Alistirma;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("enter input end with zero to stop : ");
		int num;
		do {
			num = input.nextInt();
			if (num != 0) {
				list.add(num);
			}
		} while (num != 0);

		System.out.println("max number is : " + max(list));

	}

	private static Integer max(ArrayList<Integer> list) {

		if (list == null || list.isEmpty()) {
			return null;
		}
		int max = list.get(0);
		for (int i : list) {
			if (i > max) {
				max = i;
			}
		}
		return max;

	}

}
