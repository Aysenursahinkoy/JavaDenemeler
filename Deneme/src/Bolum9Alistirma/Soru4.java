package Bolum9Alistirma;
import java.util.Random;
public class Soru4 {
	
		public static void main(String[] args) {
			
			
			Random num=new Random(1000);
			
			final int numbers=50;
			
			for (int i = 1; i < numbers; i++) {
				
				System.out.print(num.nextInt(100)+" ");
				if(i%10==0){
					System.out.println();
				}
				
				
			}
	}
}
