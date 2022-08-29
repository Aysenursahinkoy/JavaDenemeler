package Bolum5;

public class Soru12 {
	public static void main(String[] args) {
	int n=0;
	while(Math.pow(n, 2)<1200){
		n++;
	}
	System.out.println("n = "+n+" ve n^2 ="+(int)(Math.pow(n, 2)));
	}
}
