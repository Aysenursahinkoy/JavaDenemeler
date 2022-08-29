package bolum11Soru3;

import Bolum9Alistirma.Account;

public class CheckingAccount extends Account {
	private final double max=5000;
	public double cekilecekTutar;
	
	
	public CheckingAccount(double cekilecekTutar) {
		this.cekilecekTutar = cekilecekTutar;
	}


	@Override
	public double withdraw(double cekilecekTutar) {
		if(cekilecekTutar>max){
			return 0;
		}
		else{
		return super.withdraw(cekilecekTutar);
	}
	
	}
	
	
	public String toString(){
		if(cekilecekTutar==0){
			return  " limit asimi max= "+max;
			
		}
		else{
			return "kalan bakiye = " + getBalance();
		}
	
	}
}
	
