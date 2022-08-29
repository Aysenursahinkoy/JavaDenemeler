package Bolum10;

public class StringSinifi {
	public static void main(String[] args) {
		
		String message = new String("welcome to java");
		//ayni seyler bunu java bizim icin yapiyor ve biz asagidakini kullaniyoruz
		String message2="welcome to java";
		message2="HTML";//message2 artik javayi degil html i tutuyor
		char[] charArray = {'G','O','O','D'};
		String message3 = new String(charArray);
		
		String s1="java";
		String s2=new String("java");//bu derken new dedigimiz icin ramde yeni bir yerde nesne yarat diyoruz
		String s3="java";
		
		System.out.println("s1==s2 "+(s1==s2));//false cikar cunku ramde farkli yerleri gosteriyorlar
		System.out.println("s1==s3 "+(s1==s3));//true cikar cunku ramde ayni yerleri gosteriyorlar
		//neden ayni yeri gosteriyorlar cunku java string siniflari cashliyor 
		//repair siniflarda da 127 ye kadar cashleniyor
		
		Integer n1=15;
		Integer n2=15;
		System.out.println(n1==n2);//127 ye kadar cashler ve true cikar
		
		Integer n3=150;
		Integer n4=150;
		System.out.println(n3==n4);//150 asiyor ve false cikiyor
	}
}
