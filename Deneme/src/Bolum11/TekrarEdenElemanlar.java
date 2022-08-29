package Bolum11;

import java.util.ArrayList;
import java.util.Scanner;

public class TekrarEdenElemanlar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("sayilari giriniz (cikmak icin 0 a bas)");
		
		ArrayList<Integer> list = new ArrayList<>();
		while(true){
			Integer sayi = input.nextInt();
			if(sayi == 0){
				break;
			}
			if(!list.contains(sayi)){
				list.add(sayi);
			}
		}
		System.out.println(list);
		//nerde foreach kullaniyoruz = elemanin kendisini degistirmeyip sadece okuyacaksak
		
		for (Integer sayi : list) {
			System.out.print(sayi+" ");
		}
	}
}
