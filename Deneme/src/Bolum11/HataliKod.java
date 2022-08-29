package Bolum11;

import java.util.ArrayList;

public class HataliKod {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		//list.add("Denver");
		//list.add("Austin");
		//list.add(new java.util.Date()); tipi String ve date kullanmaya calisiyoruz hata veriyor
		//String city = list.get(0);
		//list.set(3, "Dallas");
		//System.out.println(list.get(3));
	
	
		list.add("dallas");
		list.add("dallas");
		list.add("dallas");
		list.add("dallas");
		list.add("houston");
		list.add("dallas");
		list.add("dallas");
		for (int i = 0; i < list.size(); i++) {
			list.remove("dallas");
		}
		//dallaslarin hepsini silmez hata firlatmaz ama hepsinide silmez
		System.out.println(list.toString());
		
		//asagidaki kod dogrudur ve butun dallaslari siler
		list1.add("dallas");
		list1.add("dallas");
		list1.add("dallas");
		list1.add("dallas");
		list1.add("houston");
		list1.add("dallas");
		list1.add("dallas");
		int size = list1.size();
		for (int i = 0; i < size; i++) {
			list1.remove("dallas");
		}
		System.out.println(list1.toString());
		
		//ikiside dogru kod fakat sagaidaki daha guzel
		list2.add("dallas");
		list2.add("dallas");
		list2.add("dallas");
		list2.add("dallas");
		list2.add("dallas");
		list2.add("houston");
		list2.add("dallas");
		list2.add("dallas");
		while(list2.contains("dallas"))
			list2.remove("dallas");
			
		
		System.out.println(list2.toString());
		
	}
}
