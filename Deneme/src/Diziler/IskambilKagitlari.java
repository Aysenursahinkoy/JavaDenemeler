package Diziler;

public class IskambilKagitlari {
	public static void main(String[] args) {
	String[] tipDizisi={"karo","maca","sinek","kupa"};
	String[] sayiDizisi={"As","2","3","4","5","6","7","8","9","10","vale","kiz","papaz"};
		
		int[] iskambil=new int[52];
		for (int i = 0; i < iskambil.length; i++) {
			iskambil[i] =i;
		}
		for (int i = 0; i < iskambil.length; i++) {
			int rassal=(int)(Math.random()*52);
			int gecici=iskambil[i];
			iskambil[i] = iskambil[rassal];
			iskambil[rassal]=gecici;
		}
		for (int i = 0; i < 4; i++) {
			String tip=tipDizisi[iskambil[i] /13];
			String sayi=sayiDizisi[iskambil[i] %13];
			System.out.println(tip+" - "+sayi);
		}
	}
}
