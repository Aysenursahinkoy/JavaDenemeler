package Bolum11Alistirma;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("ucgenin kenarlarini giriniz=");
		double side1=input.nextDouble();
		double side2=input.nextDouble();
		double side3=input.nextDouble();
		
		System.out.println("ucgenin rengi dolu ise 1 bos ise 0 = ");
		int filled=input.nextInt();
		String s="";
		if(filled==1){
			 s = "true";
		}
		else if (filled==0){
			s="false";
		}
		else{
			System.err.println("error");
		}
		
		System.out.println("ucgenin rengi = ");
		String color = input.next();
		
		Triangle t =new Triangle(side1, side2, side3);
		System.out.println("area= "+t.getArea()+ " perimetre = "+t.getPerimetre()+ " color = "+color+" filled= "+s);
		
	}
	
}
