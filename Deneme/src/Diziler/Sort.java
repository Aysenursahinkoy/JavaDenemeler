package Diziler;

public class Sort {
	public static void main(String[] args) {
		int[] numbers={5,4,8,9,2,3,12,87,54,32,21};
		java.util.Arrays.sort(numbers);//kucukten buyuge siralar
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] +" ");
		}
		
	}
}