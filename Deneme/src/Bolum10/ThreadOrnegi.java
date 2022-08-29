package Bolum10;

public class ThreadOrnegi {
	//thread ile bir is yaparsak buffer kullanmamiz lazim
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println("merhaba ( main icinden 1 )"+i);
		}
		
		new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					System.out.println("merhaba ( thread icinden )"+i);
				}
			}
		}.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("merhaba ( main icinden 2 )"+i);
		}
	}
}
