package bolum12;

import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Ayþenur\\Desktop\\JAVAC\\WS\\Deneme\\src\\Bolum3\\Piyango.java\\");
		System.out.println(file.exists());//true doner
		//file5.delete dosyayi siler ve tehlikeli
		File file2 = new File("C:\\Users\\Ayþenur\\Desktop\\JAVAC\\WS\\Deneme\\src\\Bolum35\\");
	//	System.out.println(file2.mkdir());//bolum 35 olusturdu true dondu tekrar calistirirsak false doner cunku bolum 35 artik var
		
		File file3 = new File("C:\\Users\\Ayþenur1\\Desktop\\JAVAC\\WS\\Deneme\\src\\Bolum33\\");
	//	System.out.println(file3.mkdirs());//bolum 33 olusturulamadi aysenur1`i bulamadigi icin false dondu
		
		File file4 = new File("C:\\Users\\Ayþenur\\Desktop2\\JAVAC\\WS\\Deneme\\src\\Bolum33\\");
	//	System.out.println(file4.mkdirs());//true doner users altinda aysenur1 icin izin vermemisti ama desktop2 icin yetki verdi javactan itibaren bolum33 e kadar hepsini olusturdu
		 
		
	}
}

