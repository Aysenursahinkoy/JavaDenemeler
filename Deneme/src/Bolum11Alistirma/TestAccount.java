package Bolum11Alistirma;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account("George",1122,1000);
		a.setAnnualInterestRate(1.5);
		
		
		a.deposit(30);
		a.deposit(40);
		a.deposit(50);
		a.withdraw(5);
		a.withdraw(4);
		a.withdraw(2);
		
		
		System.out.println("***********hesap ozeti**********");
		System.out.println(a.toString());
		
	}
}
