package Bolum3;

import java.util.Scanner;

public class TasKagitMakas {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int random=(int)(Math.random()*4);
		System.out.println("tas=0 kagit=1 makas=2");
		int girdi=input.nextInt();
		
		if(random==girdi){
			System.out.println("berabere");
		}
		else if(random==0 && girdi==1){
			
			System.out.println("kagit tasi sarar sen kazandin");
		}
		else if(random==0 && girdi==2){
			System.out.println("tas makasi kirar pc kazandi");
		}
		else if(random==1 && girdi==0){
			System.out.println("kagit tasi sarar pc kazandi");
		}
		else if(random==1 && girdi==2){
			System.out.println(" makas kagidi keser sen kazandin");
		}
		else if(random==2 && girdi==0){
			System.out.println("tas makasi kirar sen kazandin");
		}
		else if(random==2 && girdi==1){
			System.out.println("makas kagidi keser pc kazandin");
		}
	}
}
