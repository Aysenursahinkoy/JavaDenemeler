package Metodlar;

import java.util.Scanner;

public class VoýdTest {	
	public static void main(String[] args){
		System.out.println("Print grade is :");
		printGrade(78.5);
		System.out.println("Print garde is : ");
		printGrade(58.5);
		System.out.println("Print grade is :\n"+getGrade(78.5));
		System.out.println("Print grade is :\n"+getGrade(58.5));	
		
		//method()//ctrl+1 e bastim methodu kendi tanimladi
		nPrintln("merhaba java",33);
		
		
	}
	
	private static void nPrintln(String mesaj, int dongu) {
		for (int j = 0; j < dongu; j++) {
			System.out.println(mesaj);
			//33 kere java yazdirir
		}
		
	}

	private static void method() {
		// TODO Auto-generated method stub
		//tenimladigi method burada
	}

	public static void printGrade(double not){
		//bir method geriye bir sey donmuyorsa o methoda void geri donus degrli method denir 
		//return kullanmak zorunda kalmayiz kullanmak istersek kullaniriz return akisi yonlendirir.
		if(not>=85){
			System.out.println("A");
		}
		else if(not>=70){
			System.out.println("B");
		}
		else if(not>=60){
			System.out.println("C");
		}
		else{
			System.out.println("F");
		}
	}
	public static char getGrade(double not){
		if(not>=85){
			return 'A';
		}
		else if(not>=70){
			return 'B';
		}
		else if(not>=60){
			return 'C';
		}
		else{
			return 'F';
		}
	}
}
