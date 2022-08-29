package Metodlar;

public class Ambiguous {
	public static void main(String[] args) {
		//max(7,2); hata veriyor cunku ne yapacagini bilemedi belirsizlik oldu buna ambiguous denir
		max(7.5,2); //hata vermiyor cunku max 2 ye soktu
		max(7,8.2);//hata vermedi max 1 e soktu
		max((double)7,2);//hata vermez int double tur donusumu yaptik
	}
	public static double max(int s1,double s2){
		if(s1>s2)
			return s1;
	else
		return s2;
	}	
	public static double max(double s1,int s2){
		if(s1>s2)
			return s1;
		else
			return s2;
	}
}
