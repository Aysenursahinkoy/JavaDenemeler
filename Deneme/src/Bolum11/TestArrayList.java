package Bolum11;

import java.util.ArrayList;

import Bolum11Alistirma.GeometrcObject;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();

		cityList.add("London");
		cityList.add("Denver");
		cityList.add("paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		System.out.println("list size = "+cityList.size());
		System.out.println("is miami in the list "+cityList.contains("Miami"));//boolean deger miami listede var mi
		System.out.println("The locations of Denver in the list = "+cityList.indexOf("Denver"));
		System.out.println("is the list empty = "+cityList.isEmpty());//boolean deger doner
	
	
		cityList.add(2,"Xian");//2 den sonra xian ekle
		cityList.remove("Miami");
		cityList.remove(1);
		
		System.out.println(cityList.toString());
		System.out.println(cityList.size());
		
		cityList.set(2,"New Jersey");
		
		System.out.println("setten sonra = "+cityList.toString());
		
		System.out.println("Accessing an element = "+cityList.get(3));
		cityList.contains("New Jersey");//arama islemi yapar new jersey var mi?
		cityList.clear();
		System.out.println(cityList.toString());
		
		
		
		java.util.ArrayList<Cember> list = new java.util.ArrayList<>();
		list.add(new Cember(2));
		list.add(new Cember(3));
		
		System.out.println("the area of the circle = "+list.get(0).alanHesapla());
		System.out.println("the area of the circle = "+list.get(1).alanHesapla());
	
		
		//ArrayList<int> listInt = new ArrayList<>(); hata verir sadece nesne tutabildigi icin
		ArrayList<Integer> listInteger = new ArrayList<>();//repair siniflar zaten bu yuzden var
	}
}
