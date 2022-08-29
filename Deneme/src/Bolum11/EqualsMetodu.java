package Bolum11;

public class EqualsMetodu {
	//primitive tipler icin == kullan primitive olmayanlar icin equals kullanilir
	public static void main(String[] args) {
		Object c1=new Cember(10);
		Object c2=new Cember(10);
		
		if(c1==c2){
			System.out.println("c1 ile c2 ayni instance i gosteriyor");
			
		}
		else{
			System.out.println("gostermiyor");
		}
	
		
		//Cember.javada ki equals metodunu kapatirsak ya da metotta object yerine cember yazarsak esit degildir cikar
		//cunku ilk cembere gitmez javanin kendi kutuphanesine gider ve esit degildir cikar ama object olarak kalirsa nesnemiz esit cikar
		//Bunun sebebi equals metodunu overriding yapmamamiz  eger overloading yapmazsakta esit degil cikar
		
		
		if(c1.equals(c2)){
			System.out.println("c1 ile c2 esittir");
			
		}
		else{
			System.out.println("esit degildir");
		}
	}
}
