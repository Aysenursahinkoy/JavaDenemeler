package Bolum11;

public class TypeCasting {
	public static void main(String[] args) {
		Object o = new Student();//Implicit casting(java bizim icin yapiyor ozel bir koda gerek yok demek)
		// ykariya doru type casting yaparken nsorun yok ama tam tersi sorun olusur
		//double int atayamayiz ama int double atayabiliriz
		//Student s = o ; hata verir cunku yukarida her object bir student degildir ama her student bir objectir 
	
		Student s =(Student) o;//hata duzeldi cunku type casting yaptim bu explicit casting(yani bizim yazmamiz mudale etmemiz gerekiyor demek)
	
			
	}
}
