package alistirma;

public class tahminiNufus {
	public static void main(String[] args){
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
		int sonNufuss=(int)sonNufus5;
		System.out.println("1.yil = "+sonNufus+ " 2.yil " +sonNufus2+" 3.yil"+sonNufus3+" 4. yil "+sonNufus4+" 5.yil: "+sonNufuss );
		
	}

}
