package Bolum3;

public class RastgeleNokta {
	public static void main(String[] args) {
		System.out.println(" x , y");
		for (int i = 0; i < 10; i++) {

			int x = -50 + (int) (Math.random() * 50);
			int y = -100 + (int) (Math.random() * 100);
			
			System.out.println(x+","+y);

		}
	}
}
