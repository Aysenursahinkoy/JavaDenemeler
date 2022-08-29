
public class Continue {
	public static void main(String[] args){
		int a=0;
		int b=0;
		while(b<5){
			b++;
			if(b==2)
				continue;
			a+=b;
		}
		System.out.println(a);
	}
}
