package bolum11Soru3;

import Bolum9Alistirma.Account;
import alistirma.Cekilis;

public class SaivngsAccount extends Account{
	public double cek;

	

	public SaivngsAccount(double cek) {
		super();
		this.cek = cek;
	}



	public String toString() {
		return "kalan bakiye = " + (getBalance()-cek);

	}
}
