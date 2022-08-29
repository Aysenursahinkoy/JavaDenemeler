package Bolum10Alistirma;

public class Overloading {
	//isim ayni imza farkli
	public static void main(String[] args) {
		X x= new X();
		x.p(10);
		x.p(10.0);
	}
}
class Y{
	public void p(double i){
		System.out.println(i*2);
	}
}
class X extends Y{
	public void p(int i){
		System.out.println(i);
	}
}