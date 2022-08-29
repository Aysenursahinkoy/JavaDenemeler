package Bolum13;

import java.util.*;


public class TestCollection {


	public static void main(String[] args) {
		ArrayList<String> collection1 = new ArrayList<>();
		collection1.add("istanbul");
		collection1.add("Izmir");
		collection1.add("Eskisehir");
		collection1.add("Ankara");
		
		
		System.out.println("A list of collection1: ");
		System.out.println(collection1);
		
		System.out.println("Eskisehir in collection1? : "+collection1.contains("Eskisehir"));
		collection1.remove("Eskisehir");
		System.out.println("\n "+collection1.size()+"cities are in collection now");
		
		
		Collection<String> collection2 = new ArrayList<>();
		
		collection2.add("Bursa");
		collection2.add("Antalya");
		collection2.add("Mugla");
		collection2.add("Ankara");
		
		System.out.println("\nA list of cities in collection2:");
		System.out.println(collection2);
		
		ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());
		c1.addAll(collection2);//c1+collection2
		System.out.println("\nCities in collection1 or collection2: ");
		System.out.println(c1);
		
		c1=(ArrayList<String>) (collection1.clone());
		c1.retainAll(collection2);//c1 ve collection2nin varsa ayni elemani
		System.out.println("\nCities in collection1 and collection2:");
		System.out.println(c1);
		
		c1=(ArrayList<String>) (collection1.clone());
		c1.removeAll(collection2);//c2 yi sil ankarada gider cunku c2 de de var
		System.out.println("\nCities in collection1, but not in 2:");
		System.out.println(c1);
		
		c1.add(1, "Edirne");
		System.out.println(c1);//[istanbul, Edirne, Izmir]
		c1.set(0, "Bursa");
		System.out.println(c1);//[Bursa, Edirne, Izmir]
		
		
		
	}
}
