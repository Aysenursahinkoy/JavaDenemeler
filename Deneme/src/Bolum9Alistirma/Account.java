package Bolum9Alistirma;

public class Account {
	private int id;
	private double balance;
	private double  annualInterestRate ;
	private Date dateCreated;
	
	
	public Account(){
	dateCreated =new Date();	
	}
	public Account(int id,double balance){
		this.id=id;
		this.balance=balance;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
		
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public double getMonthlyInterestRate(){
		
		return (balance*annualInterestRate/12)/100;
	}
	public double getMonthlyInterest(){
		return (balance*annualInterestRate/12);

	}
	public double withdraw(double cekilecekTutar){
		return balance-=cekilecekTutar;
	}
	public double deposit(double yatirilanTutar){
		return balance+=yatirilanTutar;
	}
	
	
}

