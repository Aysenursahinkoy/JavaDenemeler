package bolum12;

public class Finally {
//finally blogu her kosulda calisir hata jvm tarafindan yakalansa dahi calisir
	public static void main(String[] args) {
		
	
	try{
		method();
		System.out.println(1/0);
	}catch(ArithmeticException  ex){
		System.out.println("arithmetic");
	}catch(RuntimeException ex){
		System.out.println("runtime");
	}catch(Exception ex){
		System.out.println("exception");
	}finally {
		System.out.println("finally blogu");
	}
	
}
	
	static void method() throws Exception{
		int[] list=new int[3];
		try{
			System.out.println(list[4]);
		}finally {
			System.out.println("finally blogu hep calisir");
		}
	}
	
}