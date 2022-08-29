package Bolum10Alistirma;

public class Overriding {
	//isim ve imza ayni
	public static void main(String[] args) {
		A a = new A();//a dan cagirdigimiz icin  a da ki kod calisti
		a.p(10);
		a.p(10.0);
	}
	
}
class B{
	public void p(double i ){
		System.out.println(i*2);
	}
}
class A extends B{
	// yukaridakinin ve bunun imkazalari ayni oldugu icin buna gelir ve bu methodu calistirir
	public void p(double i ){
		System.out.println(i);
	}
}
