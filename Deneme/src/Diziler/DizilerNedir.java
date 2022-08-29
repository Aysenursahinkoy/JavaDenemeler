package Diziler;

public class DizilerNedir {
	public static void main(String[] args) {
		//su ana kadar statik gorduk alani stack ten alirdi
		//diziler dinamiktir alani heap den alir
		//asagidaki dizi ya da sayiDizisi heap deki alanin ram adresidir
		//c c++ da pointer kullanilir java kullanmaz cunku kendi ram alanini asip baskasinin ram alanina girebilir
		//bunu istemedigi icin dizier vardir
		//bu yuzden javada butun rami okuyamayiz okumaya calisirsak zaten antivirus programlari uyari verir
		//stackte olusturulan seylerin bir degeri olmaz
		//butun siniflar heap de yer alir
		//gercek hayatta array kullanmiyoruz veri yapilari sonucu olan connection kutuphanesi ile arka planda kullaniyoruz
		int[] dizi;//burasi stack te olusur
		dizi=new int[20];//burada new dedigimizde bana heap den bir yer ver demek istiyoruz
		//ikiside ayni 2 turlude tanimlayabiliriz.
		int[] sayiDizi=new int[20];
		dizi[0]=20;
		dizi[1]=10;//bunlar heap de olusur 
		dizi[2]=5;
		System.out.println(dizi[10]);//0 yazdirir hic deger atamasakta bir degeri vardir 0 yazar
		System.out.println(dizi[1]);
		System.out.println(dizi[3]=3);
		//System.out.println(dizi[20]);//hata verir max 20 lik bir diziden max 19 isteyebiliriz
		System.out.println(sayiDizi.length);//sayi dizisinin uzunlugunu verir
		
		
		for (int i = 0; i < sayiDizi.length; i++) {
			sayiDizi[i]=i;
			
		}
		System.out.println(sayiDizi[15]);//deger 15 gelir cunku forda bir arttirarak sayi dizisinin elemanlari atadik

		
		int[] myList={3,5,8,9,7,2};
		System.out.println(myList[2]);//8 yazdirir cunku dizinin 2. elemani 8 dir. buna array initializers denir
		

	}
	
}
