package Bolum1;

import java.util.Scanner;

public class hayvanYili {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("bir yil gir : ");
		int yil = klavye.nextInt();

		switch (yil % 12) {
		case 0:
			System.out.println("maymun yili");
			break;
		case 1:
			System.out.println("horoz yili");
			break;
		case 2:
			System.out.println("kopek yili");
			break;
		case 3:
			System.out.println("domuz yili");
			break;
		case 4:
			System.out.println("fare yili");
			break;
		case 5:
			System.out.println("okuz yili");
			break;
		case 6:
			System.out.println("kaplan yili");
			break;
		case 7:
			System.out.println("tavsan yili");
			break;
		case 8:
			System.out.println("ejdeha yili");
			break;
		case 9:
			System.out.println("yilan yili");
			break;
		case 10:
			System.out.println("at yili");
			break;
		case 11:
			System.out.println("kuzu yili");
			break;
		default:
			System.out.println("yanlis secim");
			break;
		}
	}

}
