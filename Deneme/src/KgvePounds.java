
public class KgvePounds {
	public static void main(String[] args){
	 int kg=1;
	 double pound=22;
	 System.out.println("    KG     POUND        POUND    KG");
		for ( kg = 1; kg < 200; kg += 2) {
			System.out.println("    "+kg+"    "+(kg*pound)/10+"        "+(kg*pound)/10+"    "+kg);
		}
	}
}
