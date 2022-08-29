package Bolum7;

import java.util.Scanner;

public class Soru19 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("dizinin uzunlugu = ");
		int lenght=input.nextInt();
		System.out.println("ortlamana alinmasi icin kac sayi girmek istiyorsunuz : ");
		
		int [] list=new int[lenght];
		for (int i = 0; i < list.length; i++) {
			list[i]=input.nextInt();
		
		}
		if(isSorted(list)==true){
			System.out.println("the list is already sorted");
		}
		else if(isSorted(list)==false){
			System.out.println("the list is not sorted");
		}
		
	}
	public static boolean isSorted(int[] list){
		for (int i = 0; i < list.length; i++) {
			
		
			if(list[i]>list[i+1]){
				
				return false;
			}
			else if(list[i]<list[i+1]){
				return true;
			}
		}
		return false;
	
		
	}

}