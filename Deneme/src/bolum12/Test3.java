package bolum12;

public class Test3 {
	public static void main(String[] args) {
		try{
			int value=30;
			if(value<40)
				throw new Exception("value is too small");
			System.out.println("try icinde");//bu yazilir cunku catch e girmedi kosul dogru oldu icin
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			System.out.println("continue after the catch block");
			//burasi calisir cunku kod hata verdi ve calismaya devam etti
	}
}
