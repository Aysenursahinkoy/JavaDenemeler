package Bolum8;

public class SinavSonucu {
	public static void main(String[] args) {
		char[][] cevaplar = { 
				{ 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
			for (int i = 0; i < cevaplar.length; i++) {
				int dogruCevapSayisi=0;
				for (int j = 0; j < cevaplar[i].length; j++) {
					if (cevaplar[i][j] == keys[j]) {
						dogruCevapSayisi++;
					}
				}
				//dongunun icine yazdim cunku 8 ayri cevap cikacak. 
				System.out.println((i+1)+".ogrenci "+dogruCevapSayisi+" tane dogru cevap saayisi vardir.");
			}
	}
}
