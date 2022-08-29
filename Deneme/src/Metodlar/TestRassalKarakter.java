package Metodlar;

public class TestRassalKarakter {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.findBuyukHarf()+"  ");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.findKucukHarf()+"  ");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.findRakam()+"  ");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print(RassalKarakter.findHerhangiKarakter()+"  ");
		}
}
}
