package Bolum11;

public class Test {
	public static void main(String[] args) {
		Integer[] list1= {12,24,55,1};
		Double[] list2={12.4,10.4};
		int[] list3={1,2,3};
		
		printArray(list1);
		printArray(list2);
	//	printArray(list3); hata verir cunku int primitive bir tip primitive bir tipi object olarak veremeyiz
		
	}
	public static void printArray(Object[] list){
		for (Object o : list) {
			System.out.print(o+" ");
			System.out.println();
		}
	}
}
