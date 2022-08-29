package bolum12;

public class Test4 {
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			System.out.print(i+" ");
			try{
				System.out.println(1/0);
			}catch(Exception ex){
			//	ex.printStackTrace(); bunun icini bos birakirsak hata yazilmaz bos bir hata kodu bir ise yaramaz cok tehlikelidir
			}
		
		}
	}
}
