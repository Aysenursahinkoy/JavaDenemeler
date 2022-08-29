package Bolum11;

import java.util.ArrayList;
import java.util.Arrays;

public class FaydaliArrayListMetodlari {
	public static void main(String[] args) {
		String[] array = {"red","green","blue"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		
		System.out.println(list);//arrayden arrayliste dondu
		
		String[] array1 = {"red","green","blue"};
		list.toArray(array1);
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Integer[] array3 = {3,5,95,4,15,43,3,6,5};
		//Arrays.sort(array3);c2 alt satirla ayni isi yapar min max gibi metodlari yok
		ArrayList<Integer>list3 = new ArrayList<>(Arrays.asList(array3));
		java.util.Collections.sort(list3);
		System.out.println(java.util.Collections.min(list3));
		System.out.println(java.util.Collections.max(list3));
		
		System.out.println(list3);
		java.util.Collections.shuffle(list3);//karistirma
		System.out.println(list3);
	}
}
