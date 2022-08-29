package bolum12;

public class Test2 {
	public static void main(String[] args) {
		try{
			int value=30;
			if(value<40)
				throw new Exception("value is too small");
			System.out.println("try icinde");//bu yazilmaz cun ku hatayi catch yakaliyor ve yazdiriyor kod hatasi 11. satirda yaziliyor o yuzden burasi calismaz
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			System.out.println("continue after the catch block");
			//burasi calisir cunku kod hata verdi ve calismaya devam etti
	}
}
