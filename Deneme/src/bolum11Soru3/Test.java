package bolum11Soru3;

import Bolum9Alistirma.Account;

public class Test {
	public static void main(String[] args) {
		Account a = new Account();
		SaivngsAccount s = new SaivngsAccount(2000);
		CheckingAccount c = new CheckingAccount(3500);

		System.out.println(a.getBalance());
		System.out.println(s.toString());
		System.out.println(c.toString());
	}
}
