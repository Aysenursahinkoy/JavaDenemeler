package Bolum7;

public class Soru6 {
	public static void main(String[] args) {
		int SIZE=100;
		int RANGE=10;
		
		int[] counts=new int[RANGE];
		int[] randomNumbers=new int[SIZE];
		for (int i = 0; i < randomNumbers.length; i++) {
			int random=(int)(Math.random()*RANGE);
			randomNumbers[i]=random;
			counts[random]++;
		}
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.print(randomNumbers[i]+" ");
			if((i+1)%10 == 0)
			{
				System.out.println("");
			}
			
			}
		 System.out.println("---------------------------");
	        for (int i = 0; i < counts.length; i++) {
	            System.out.println( i + " = " + counts[i]);


	        }
		
		}
	 public static void printArray(int[] array, int numberPerLine) {

	        for (int i = 0; i < array.length; i++) {

	            System.out.printf("%4d", array[i]);
	            if ((i + 1) % numberPerLine == 0) System.out.println("");
	        }
	    }
	}

