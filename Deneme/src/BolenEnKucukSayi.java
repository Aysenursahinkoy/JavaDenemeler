import java.util.Scanner;

public class BolenEnKucukSayi {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("bir sayi giriniz :");
		int sayi = k.nextInt();

		int bolen = 2;
		while (bolen <= sayi) {
			if (sayi % bolen == 0)
				break;
			bolen++;

		}
		System.out.println(bolen);
	}
}
