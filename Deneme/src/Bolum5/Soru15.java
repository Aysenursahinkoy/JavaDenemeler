package Bolum5;

public class Soru15 {
	public static void main(String[] args) {
		for (int i = 49; i < 127; i++) {
		System.out.print((char)i+" ");
		if(i%10==8){
			System.out.println();
		}
		}
	}
}
