import java.util.Scanner;

import Bolum10Alistirma.StackOfIntegers;

public class Soru5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("pozitif bir sayi giriniz : ");
		int sayi=input.nextInt();
		
		StackOfIntegers stack =new StackOfIntegers(20);
		int i=2;
		while (i <=sayi) {
			if(sayi%i ==0){
				stack.push(i);
				sayi/=i;
			}
			else{
				i++;
			}
		}
		while(!stack.empty()){
			System.out.print(stack.pop()+ " ");
		}
	}
}
