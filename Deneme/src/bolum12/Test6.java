package bolum12;

public class Test6 {
	public static void main(String[] args) {
		//runtime calisir cunku  java.lang.ArrayIndexOutOfBoundsException runtime exp. turetilmistir 
		//runtime olmasa exception yakalardi oda olmasaydi jvm yakalardi ve programi kapatirdi
		try{
			int[] list = new int[10];
			System.out.println("list"+list[10]);
		}catch(ArithmeticException ex){
			System.out.println("arithmetic");
		}catch(RuntimeException ex){
			System.out.println("runtime");
		}catch(Exception ex){
			System.out.println("exception");
		}
	}
	
	
}
