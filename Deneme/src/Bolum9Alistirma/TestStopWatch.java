package Bolum9Alistirma;

import java.util.Random;

public class TestStopWatch {
	public static void main(String[] args) {
		StopWatch s1 = new StopWatch();
		
		Random r1=new Random();
		
		int[] array=new int[100_000];
		for (int i = 0; i < array.length; i++) {
			array[i]=r1.nextInt(100_000);
			
		}
		s1.start();
		selectionsort(array);
		s1.stop();
	
		
		System.out.println("Time ="+ s1.getElapsedTime()+" millisecond /  "+((double)(s1.getElapsedTime())/1000)+" second.");
	}

	public static void selectionsort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int smallestNumbers=array[i];
			int smallestNumbersIndex=i;
			for (int j = i+1;  j< array.length; j++) {
				if (smallestNumbers>array[j]) {
					smallestNumbers=array[j];
					smallestNumbersIndex=j;
					
				}
			}
			if(smallestNumbersIndex!=i){
				array[smallestNumbersIndex]=array[i];
				array[i]=smallestNumbers;
			}
		}
	}
}
