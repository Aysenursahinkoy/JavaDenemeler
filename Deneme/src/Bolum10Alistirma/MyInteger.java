package Bolum10Alistirma;

public class MyInteger {
	private int value;

	public MyInteger(int value) {

		this.value = value;

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isEven() {
		return value % 2 == 0;
	}

	public boolean isOdd() {
		return !isEven();
	}

	public boolean isPrime() {
		double range = Math.sqrt(value);
		for (int i = 2; i < range; i++) {
			if (value % i == 0) {
				return false;
			}
		}
			return true;
		

	}

	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOdd(int value) {
		return !isEven(value);
	}

	public static boolean isPrime(int value) {
		double range = Math.sqrt(value);
		for (int i = 2; i < range; i++) {
			if (value % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static boolean isEven(MyInteger myInteger) {

		return myInteger.isEven();
	}
	
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}

	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	
	}

	public boolean equals(MyInteger myInteger) {
		return this.value == myInteger.value;
	}

	public boolean equals(int value) {
		return this.value==value;
	}
	
	public static int parseInt(char[] value){
		double valueDouble =0;
		int toPower = value.length-1;
		for (char aValue : value) {
			
			valueDouble +=Math.pow(10, toPower--)*(aValue - '0');
		}
		return (int)valueDouble;
	}
	public static int parseInt(String value){
		return MyInteger.parseInt(value.toCharArray());
	}
}
