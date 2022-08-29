package Bolum11Soru2;

public class Person {
	protected String name;
	protected String adress;
	protected String phoneNumber;
	protected String ePosta;
	
	public Person(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}
	@Override
	public String toString(){
		return "name:"+getName()+" Class: "+this.getClass().getName();
		
	}
}
