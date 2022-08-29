package Bolum10;

import java.math.*;

public class LargeFactorial {
	public static void main(String[] args) {
		System.out.println("50! is \n"+factorial(50));
		System.out.println("50! is \n"+factorialLong(50));//tasma yapar
	}

	public static BigInteger factorial(long n) {
		BigInteger result = new BigInteger("1");//BigInteger.ONE; ayni sey
		for (int i = 1; i <= n; i++) 
			result = result.multiply(new BigInteger(i+""));
			
			return result;
		
	}
	public static long factorialLong(long n){
		long l=1;
		for (int i = 1; i <=n ; i++) {
			l*=i;
			
		}
		return l;
	}
	
	
	
}
