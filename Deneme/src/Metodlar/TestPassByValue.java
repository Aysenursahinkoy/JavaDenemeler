package Metodlar;

public class TestPassByValue {
	public static void main(String[] args) {
		int num=1;
		int num2=2;
		System.out.println("methoddan once num 1: "+num +" num 2:"+num2 );
		swap(num,num2);
		System.out.println("methoddan sonra num 1: "+num +" num2: "+num2);
		
	}

	private static void swap(int n1, int n2) {
		System.out.println("methodun icinde n1: "+n1 +" n2:"+n2);
		
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("Sonra n1:"+n1+" n2:"+n2);
	}

}
