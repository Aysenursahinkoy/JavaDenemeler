package Bolum11Soru2;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("ayse");
		Employee e=new Employee("ays");
		Staff s=new Staff("ay");
		Faculty f= new Faculty("a");
		Student sd = new Student("aysenur");
		
		
		System.out.println(p.toString());
		System.out.println(e.toString());
		System.out.println(s.toString());
		System.out.println(f.toString());
		System.out.println(sd.toString());
		
		
	}
}
