package Bolum11Soru2;

public class Staff extends Employee{

	public Staff(String name) {
		super(name);
		
		
	}
	@Override
	public String toString(){
		return " name: "+getName()+" class: "+this.getClass().getName();
		
	}

	
}
