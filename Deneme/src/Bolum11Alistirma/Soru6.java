package Bolum11Alistirma;

import java.util.ArrayList;
import java.util.Date;
/*
 * ( ArrayLst kullan�m� ) Br ArrayLst nesnesne, Loan t�r�nden br nesne, Date t�r�nden br nesne,
 * strng t�r�nden br nesne ve Crcle t�r�nden br nesne ekleyen ve br d�ng� �ersnde bu
*  nesnelern toStrng() metodunu �a��rarak ekranda g�steren br program yaz�n�z
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
