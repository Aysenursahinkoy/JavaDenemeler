package Bolum11Soru2;

import Bolum9Alistirma.Date;

public class Employee extends Person {
	protected String office;
	protected double salary;
	protected Date date;
	
	public Employee(String name) {
		this(name,0,"none",new Date());
	}
	
	public Employee(String name, double salary,String office, Date date) {
		super(name);
		this.office = office;
		this.salary = salary;
		this.date = date;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString(){
		return " name: "+getName()+" class: "+this.getClass().getName();
		
	}

}
