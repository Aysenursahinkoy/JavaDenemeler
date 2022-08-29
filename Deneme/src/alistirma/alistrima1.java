package alistirma;

public class alistrima1 {
	public static void main(String[] args){
		
		double a=((9.5*4.5)-(2.5*3))/(45.5-3.5);
		
		System.out.println(a);
		
		for (int i = 0; i <10; i++) {
			
			System.out.println();
			
		}
		
		 double r=5.5;
		 double cevre=r*Math.PI;
		double alan=r*r*Math.PI;
		 System.out.println("alan : "+alan+ " cevre : "+cevre);
		 
		double genislik =2.4;
		double h=3.5;
		double alan2= h*genislik;
		System.out.println("alan = "+alan2);
		
		double x=((44.5*0.55)-(50.2*5.9))/((3.4*0.55)-(50.2*2.1));
		double y=((3.4*5.9)-(44.5*2.1))/((3.4*0.55)-(50.2*2.1));
		System.out.println("x : "+x+" y : "+y);
		
		
		double dogan=(365*24*60*60)/7;
		double olen=(365*24*60*60)/13;
		double goc=(365*24*60*60)/45;
		double suan=312032486;
		double o=dogan+goc-olen;
		double sonNufus=suan+o;
		double sonNufus2=sonNufus+o;
		double sonNufus3=sonNufus2+o;
		double sonNufus4=sonNufus3+o;
		double sonNufus5=sonNufus4+o;
		System.out.println("1.yil = "+sonNufus+ " 2.yil " +sonNufus2+" 3.yil"+sonNufus3+" 4. yil "+sonNufus4+" 5.yil: "+sonNufus5 );
		
}
}
