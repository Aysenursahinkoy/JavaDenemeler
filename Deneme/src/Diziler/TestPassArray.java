package Diziler;

public class TestPassArray {
	public static void main(String[] args) {
		int[] a={1,2};
		System.out.println("swapten once:");
		System.out.println(a[0]+" "+a[1]);
		swap(a[0],a[1]);
		System.out.println("swapten sonra:");
		System.out.println(a[0]+" "+a[1]);
		
		System.out.println("swapfirstten once:");
		System.out.println(a[0]+" "+a[1]);
		swapFirstTwoInArray(a);
		System.out.println("swapFirstten sonra:");
		System.out.println(a[0]+" "+a[1]);
	}
	//int parametre alan bir mthod hicbir sey degistiremez ondan 1 2 , 1 2 olarak kaldi
	public static void swap(int n1,int n2) {
		int gecici=n1;
		n1=n2;
		n2=gecici;
	}
	public static void swapFirstTwoInArray(int[] array){
		int gecici=array[0];
		array[0]=array[1];
		array[1]=gecici;
	}
}
