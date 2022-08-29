package Bolum3;

import java.util.Scanner;

public class ToplamaSinavi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dogru=0;
		int yanlis=0;
		for (int i = 0; i < 10; i++) {
			
			int random=(int)(Math.random()*100);
			int random2=(int)(Math.random()*100);
				System.out.println(random+"+"+random2+" = ");
				int sonuc=input.nextInt();
				if(sonuc==(random+random2)){
					System.out.println("true");
					dogru++;
				}
				else{
					System.out.println("false");
					yanlis++;
				}
				
				
				
			}
		System.out.println("dogru= "+dogru+" yanlis= "+yanlis);
		
		

	}
	
	}

