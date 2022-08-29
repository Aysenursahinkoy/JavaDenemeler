package alistirma;

public class Cekilis {
	public static void main(String[] args) {
		int r=(int)(Math.random()*4);
		System.out.println(r);
		if(r==0){
			System.out.println("bg");
		}else if(r==1){
			System.out.println("mac");
		}else if(r==2){
			System.out.println("bb");
		}else if(r==3){
			System.out.println("ayvalik");
		}
		else if(r==4){
			System.out.println("pizza");
		}
	}
}
