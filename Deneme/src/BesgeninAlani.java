import java.util.Scanner;

public class BesgeninAlani {
	public static void main(String[] args){
		Scanner k=new Scanner(System.in);
		System.out.println("besgenin r yarý capýný giriniz : ");
		double r=k.nextDouble();
		double a=2*(Math.sin(Math.PI/5));
		double s=a*r;
		double alan=(5*s*s)/(4*Math.tan(Math.PI/5));
		double b=alan*100;
		System.out.println("besgenin alaný : "+b/10+" dir.");
	}
}
