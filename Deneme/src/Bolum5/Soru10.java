package Bolum5;

public class Soru10 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			if(i%6==0||i%5==0){
				System.out.printf("%4d ",i);
				
				if(i%10==6){
					System.out.println();
				}
			}
		}
	}
}
