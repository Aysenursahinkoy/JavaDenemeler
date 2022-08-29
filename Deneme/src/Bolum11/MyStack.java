package Bolum11;

import java.util.ArrayList;

public class MyStack {

	private ArrayList<Integer> list;

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Integer peek() {
		return list.get(list.size() - 1);
	}

	public Integer pop() {
		int sayi = list.get(list.size() - 1);
		list.remove(list.size());
		return sayi;
	}

	public void push(Integer sayi) {
		list.add(sayi);
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
