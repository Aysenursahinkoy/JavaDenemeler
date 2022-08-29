package Bolum1;

import java.util.Scanner;

public class HatcaiciMiHaftasonuMu {
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		System.out.println("bir gün giriniz(pazartesi icin 1 pazar icin 7 gibi)");
		int gun = klavye.nextInt();
		
		switch (gun) {
		case 1:System.out.println("hafta ici");
			
			break;
		case 2:System.out.println("hafta ici");
		break;
			
		case 3:System.out.println("hafta ici");
		break;
		
			
		case 4:System.out.println("hafta ici");
			break;
		case 5:System.out.println("hafta ici");
			break;
		case 6:System.out.println("hafta sonu");
			break;
		case 7:System.out.println("hafta sonu");
		break;
		default:System.out.println("yanlis girdi");
			break;
		}
		System.out.println("Devam etmek istiyor musunuz ? ");
		String cevap = klavye.next();
		switch (cevap.charAt(0)) {
		
		case 'e':
		case 'E':
			System.out.println("devam ediliyor.");
			
			break;
		case 'h':
		case 'H':
			System.out.println("duruyor.");
			break;
		default:System.out.println("yanlis saecim ");			break;
		}
	}
}
