package bolum12;

import Bolum11.Cember;

public class Test8 {
	public static void main(String[] args) {
		try{
			method();
			System.out.println("after the method call");
		}catch(RuntimeException ex){
			System.out.println("runtime in main");
		}catch(Exception ex){
			System.out.println("exception in main ");
		}
	}

	 static void method() throws Exception{
		 try{
			System.out.println(1/0);
		 }catch (RuntimeException ex) {
			 System.out.println("runtime in method");
			 throw ex;
		 }catch (Exception ex) {
			 System.out.println("exception in method");
			
		 }
	}
}
