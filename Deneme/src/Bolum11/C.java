package Bolum11;

class A{
public A(){
	System.out.println("A's no-arg constructor is inkoved");
	}
}

class B extends A {
	
}

public class C{
	public static void main(String[] args) {
		B b= new B();
	}
}