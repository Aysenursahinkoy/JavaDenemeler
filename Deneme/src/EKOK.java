import java.util.Scanner;

public class EKOK {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("1.sayi:");
		int sayi = k.nextInt();
		System.out.println("2.sayi:");
		int sayi2 = k.nextInt();

		int bolen = 2;
		while (bolen <= sayi && bolen <= sayi2) {

			if (sayi % bolen == 0 && sayi2 % bolen == 0)
				break;

			bolen++;
		}
		if (sayi % sayi2 == 0 || sayi2 % sayi == 0) {
			System.out.println("ekok : " + bolen);
		} else {
			System.out.println(" ekok  : 1");
		}

	}

}
