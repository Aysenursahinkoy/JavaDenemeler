package Metodlar;

import java.util.Scanner;
//zor bir koddu ama olsun yaptim cok ugrastim...
public class HexToDecMethod {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("bir hex sayi giriniz : ");
		String hex = k.nextLine();
		int dec = HextoDec(hex.toUpperCase());//butun gelen harfler buyuk algilansin
		System.out.println(hex + " hex sayisinin degeri : " + dec);
	}

	public static int HextoDec(String hex) {
		int dec = 0;
		int basamakDegeri=1;
		for (int i = hex.length() - 1; 0 <= i; i--) {
			char hexChar = hex.charAt(i);
			int sayiDegeri = hexCharToDec(hexChar);
			dec+= sayiDegeri*basamakDegeri;
			basamakDegeri*=16;
		}
		return dec;
	}

	public static int hexCharToDec(char ch) {
		if ('A'<=ch && ch <= 'F') {
			return ch - 'A'+10;
			//ch karakterin ascii kodundan a nin ascii4 kodunu cikarinca kalan a ise 0 b ise 1 vs uzerine 10 eklersek a 10 b 11 olur
		} else {
			return ch - '0';
		}
	}
}
