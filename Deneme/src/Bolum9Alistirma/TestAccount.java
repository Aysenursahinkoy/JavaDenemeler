package Bolum9Alistirma;

public abstract class TestAccount {
	public static void main(String[] args) {
		Account a1=new Account(1122,20_000);
		
	a1.setAnnualInterestRate(4.5);
	a1.withdraw(2_500);
	a1.deposit(3_000);
	
	
	System.out.println("bakiye = "+a1.getBalance()+" aylik faiz = "
	+a1.getMonthlyInterestRate()+" tarih = "+a1.getDateCreated());
	
	}
}
