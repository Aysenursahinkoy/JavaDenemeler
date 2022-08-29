import java.util.Scanner;

public class Palidrone {
	public static void main(String[] args){
		Scanner k= new Scanner(System.in);
		System.out.println("bir cumle giriniz : ");
		String cumle = k.nextLine();
		
		boolean polidronMu=true;
		for (int i = 0 , j=cumle.length()-1; i <j ; i++ , j--) {
			char c1=cumle.charAt(i);
			char c2=cumle.charAt(j);
			if(c1 != c2){
				polidronMu = false;
				break;
				//(break koymamizin nedeni uzun bir cumlede bastan false oldugunu anlasin diye)
			}
		}
		if(polidronMu){
			System.out.println(cumle+" palidrondur");
		}else{
			System.out.println("polindron degildir");
		}
	}
}
