package Bolum10;

public class StringSinifi3 {
	public static void main(String[] args) {
		
		System.out.println("java is fun".matches("java......."));//true cikar cunku 7 tane noktayi ihtiyaci vardi ve koyduk ama bunun koly ve garanti yolu .*dir
		System.out.println("java is cool".matches("java.*"));//* soldakini coklamak icin var . yi gereken kadar cokladi
		System.out.println("java is powerful".matches("java.*"));
		
		System.out.println("a+b$#c".replaceAll("[$+#]", "NNN"));

		char[] dst ={'J','A','V','A','1','3','0','1','4'};//4.indexten itibaren yani 1 
		"CSSelam".getChars(2, 7, dst, 4);//2.index ve 7.index Selam 
		System.out.println(dst);//yer degirtirip yazdirdik
		
		String s= 3 + 3 + " deger";
		String n= "deger " + 3 + 3 ;
		System.out.println(s);
		System.out.println(n);
		String a = String.format("%7.2f%6d%-4s", 45.556,14,"AB");
		System.out.println(a);
	}
}
