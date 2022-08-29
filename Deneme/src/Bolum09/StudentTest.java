package Bolum09;

public class StudentTest {
	public static void main(String[] args) {
		Student s ;
		//System.out.println(s.name); hata verir cunku local degiskenlere ilk deger atamak gerekir
		
		s= new Student();
		
		System.out.println(s.name);//instance oldugu icin ilk deger atanmak zorunda degiliz.
		//ciktisi null olur hata degildir degeri nulldir
		s.name="Java";
		System.out.println(s.name.charAt(0));//ciktisi J olur
		
		System.out.println(s.gender);//bos cikar cunku ascii de null karakterinin karsiligi yok bir sey yaziyor ama bos
	
		
	}
}
