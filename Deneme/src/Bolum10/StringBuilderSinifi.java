package Bolum10;

public class StringBuilderSinifi {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		str.append("welcome");
		str.append(' ');
		str.append("to");
		str.append(' ');
		str.append("java");
		str.insert(11, "HTML and ");//11. karakterine ekle
		str.delete(8, 11);//8 ve 11 arasini sil
		str.deleteCharAt(8);//8.index sil
	//	str.insert(8, 'H');//8. indexe h koyar
		str.reverse();//string ter cevrilir
		str.reverse();//iki kere reverse yaptim eski haline dondu
		str.replace(11, 15, "HTML");//11 ve 15 arasini html olarak degistir
		str.setCharAt(0, 'a');//0. indexin karakterini w olarak degistir
		System.out.println(str.toString());//nenseyi stringe donusturme
		
		System.out.println(str.capacity());//kapasitayi verir
		System.out.println(str.length());//stringin uzunlugu verir su an 20 bu sabit olamaz cunku ummitable degildir
		
		str.trimToSize();// uzunlugu kapasiteye esitler ikiside 20 olur.
		System.out.println(str.capacity());//20 verir
		System.out.println(str.length());//20 verir
		
		str.setLength(100);//string uzunlugunu 100e ceker ve string yazilirken devaminda null karakterler olur yani bosluk
		
		str.setLength(5); //ilk 5 tanesini yazidirir gerisini trim eder
		
	}
}
