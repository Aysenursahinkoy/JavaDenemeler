package Bolum11;

public class Test2 {
	public static void main(String[] args) {
		new Pers().printPers();
		new Student().printPers();
	}

}

class Student extends Pers {
	//@Override
	public String getInfo() {
		return "Student";
	}
}

   class Pers {
	public String getInfo() {
		return "Person";
	}

	public void printPers() {
		System.out.println(getInfo());
	}
}