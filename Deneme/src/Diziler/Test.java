package Diziler;

public class Test {
	public static void main(String[] args) {
		int x=1;
		int[] y=new int[10];
		m(x, y);
		System.out.println("x:"+x);
		System.out.println("y[0]:"+y[0]);
		
		
	}

	private static void m(int num , int[] num2) {
		num2=new int[10];//iste burada degisr ve 1 0 yazdirir
		num=1001;
		num2[0]=5555;
		//num2=new int[10]; bir sey degismez
	}
}
