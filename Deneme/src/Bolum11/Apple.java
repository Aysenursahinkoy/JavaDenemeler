package Bolum11;

public class Apple extends Fruit {
	public Apple(String name) {
		super(name);
		//ya da bunu yazip hatadan kurtulucaz
	}
	

}
	
class Fruit{
	/*public Fruit(){
		hatayi cozmek icin ya bunu yazicaz yani bos constructor 
	}*/
	public Fruit(String name){
		System.out.println("Fruit constructor is inkoved");
		}
	}
