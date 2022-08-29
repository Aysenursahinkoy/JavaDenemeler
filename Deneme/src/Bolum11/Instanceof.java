package Bolum11;

public class Instanceof {
	public static void main(String[] args) {
		
		//KirmiziElma p = new Apple(); bunu diyemem cunku buyuk olan kucuk olana atanmaz
		//Apple p =new KirmiziElma();
		// buyuk olan x = new kucukolan();
		
		Object o = new Student();
		
		if(o instanceof Student){
			Student s= (Student) o;
			s.printPers();
		}
		
		//o =new Apple("AYSE"); bunu yazarsak calisir cunku o artik baska bir nesneyi gosteren referans
		
		if(o instanceof Apple){//instanceof boolean doner sol sagin instanceof mudur
			Apple a = (Apple) o;
			System.out.println("buraya girmeyecek");
			//girmez cunku o bir apple in instanceof degil
		}
	}
}
