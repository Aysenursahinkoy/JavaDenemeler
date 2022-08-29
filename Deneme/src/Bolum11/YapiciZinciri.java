package Bolum11;

public class YapiciZinciri {
	public static void main(String[] args) {
		new Akademisyen();
		
	}
}
	
	class Akademisyen extends Calisan {
		public Akademisyen(){
			//super(); burada gizli bir super oldugu icin calisan sinifina gitti
			System.out.println("akademisyenin yapicisi calisiyor");
		}
	}
	
	class Calisan extends Person{
		public Calisan(){
			//super(); gizli super
			this("calisanin yuklenmis yapicisini cagiriyoruz");
			System.out.println("calisanin yapicisi cagirildi");
			
		}
		public Calisan(String s){
			System.out.println(s);
		}
	}
	class Person{
		public Person(){
			System.out.println("Person'in yapicisi calisti");
		}
	}

