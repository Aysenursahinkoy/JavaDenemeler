package Bolum1;

import java.util.Scanner;

public class haftaiciHaftasonuKisa {
	public static void main(String[] args){
		Scanner klavye = new Scanner(System.in);
		System.out.println("bir gun gir(pazar ise 7 salý ise 2 gibi ) : ");
		int gun = klavye.nextInt();
		switch (gun) {
		case 1:
		case 2:
		case 3:System.out.println("ben 3.case icindeyim");
		case 4:
		case 5:
			System.out.println("hafta ici");
			
			break;
		case 6:
		case 7:
			System.out.println("hafta sonu");
			break;
		default:System.out.println("yanlis giris");
			break;
		}
		 
	}

}
