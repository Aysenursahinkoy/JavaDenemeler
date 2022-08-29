package Bolum11Alistirma;

import java.util.ArrayList;
import java.util.Date;
/*
 * ( ArrayLst kullanýmý ) Br ArrayLst nesnesne, Loan türünden br nesne, Date türünden br nesne,
 * strng türünden br nesne ve Crcle türünden br nesne ekleyen ve br döngü çersnde bu
*  nesnelern toStrng() metodunu çaðýrarak ekranda gösteren br program yazýnýz
*/

import Bolum11.Cember;

public class Soru6 {
	public static void main(String[] args) {
		
		
		ArrayList<Object> s = new ArrayList<>();
		
		s.add(new Date());
		s.add(new  Cember());
		s.add(new String());
		
		s.forEach(System.out::println);
		

	}
}
