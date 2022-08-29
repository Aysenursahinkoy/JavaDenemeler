package Diziler;

public class DizidekiHarfleriSayalim {
	public static void main(String[] args) {
		char[] karakterdizisi=rassalDiziYarat();
		
		karakterDizisiyazdir(karakterdizisi);
		int[] sayac=harfleriSay(karakterdizisi);
		sayaciYazdir(sayac);
	}

	private static void sayaciYazdir(int[] sayac) {
		System.out.println("sayac yazdiriliyor");
		for (int i = 0; i < sayac.length; i++) {
			System.out.print((char)('a'+i) +":"+sayac[i]+" ");
			if((i+1)%10==0){
				System.out.println();
			}
			
		}
	}

	private static int[] harfleriSay(char[] karakterdizisi) {
		int[] sayac=new int[26];
		for (int i = 0; i < karakterdizisi.length; i++) {
			sayac[karakterdizisi[i]-'a']++;
			
		}
		
		return sayac;
		
	}

	private static void karakterDizisiyazdir(char[] karakterdizisi) {
		
		for (int i = 0; i < karakterdizisi.length; i++) {
			System.out.print(karakterdizisi[i]+" ");
			if((i+1)%20==0){
				System.out.println();
			}
			
		}
	}

	public static char[] rassalDiziYarat() {
			char[] dizi=new char[100];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]=rassalKarakterBul();
			
		}
		return dizi;
	}

	private static char rassalKarakterBul() {
		return (char)((int)(Math.random()*('z'-'a'+1))+'a');
	}
}
