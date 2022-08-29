package bolum12;

public class Test7 {
	public static void main(String[] args)  {
	try{
		method();
		System.out.println("after the method call");
	}catch(RuntimeException ex){
		System.out.println("runtime in main");
	}catch(Exception ex){
		System.out.println("exception in main");
	}
	}

	 static void method() throws Exception {
		 try{
			 String s="abc";
			 System.out.println(s.charAt(3));
		 }catch(RuntimeException ex){
			 System.out.println("runtime in method()");
		 }catch(Exception ex){
			 System.out.println("Exception in method()");
		 }
	}
	
	 //throws Exception yazmazsak hata verir ya da exception i  runtime exp. olarak degistirmeliyiz
	 //runtime exp. unchecked dir
	 public void m(int value) throws Exception{
		 if(value<40){
			 throw new Exception("value is too small");
		 }
	 }
}
