package Bolum11Soru2;

public class Faculty extends Employee{
	
	public Faculty(String name) {
		super(name);
	}
	private long oficeHours;
	private int rank;
	public long getOficeHours() {
		return oficeHours;
	}
	public void setOficeHours(long oficeHours) {
		this.oficeHours = oficeHours;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString(){
		return " name: "+getName()+" class: "+this.getClass().getName();
		
	}
	
}
