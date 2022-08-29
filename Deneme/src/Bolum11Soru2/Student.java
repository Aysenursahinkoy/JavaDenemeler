package Bolum11Soru2;

public class Student extends Person{
	
	protected String classStatus;
	public static final String freshman= "freshman";
	public static final String sophomore ="sophomore";
	public static final String junior="junior";
	public static final String senior="senior";
	
	public Student(String name){
		super(name);
	}
	public Student(String name,String classstatus){
		super(name);
		this.classStatus=classStatus;
	}
	
	@Override
	public String toString(){
		return "name: "+getName()+" class:"+this.getClass().getName();
		
	}
	
}
