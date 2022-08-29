package Bolum10;

public class TestVki {
	public static void main(String[] args) {
		VKI vki1=new VKI("ayse", 54, 1.64);
		VKI vki2=new VKI("deniz", 90, 1.80);
		System.out.println(vki1.getName()+" icin vki = "+vki1.vkiHesapla()+" durumu = "+vki1.durumBul());
		System.out.println(vki2.getName()+" icin vki = "+vki2.vkiHesapla()+" durumu = "+vki2.durumBul());

	}
}
