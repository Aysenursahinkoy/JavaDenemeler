package bolum12;

public class Test5 {
	public static void main(String[] args) {
		try{
			for (int i = 0; i < 2; i++) {
				System.out.println(i+" ");
				System.out.println(1/0);
			}
		}catch(Exception ex){
			
		}
	}
}
