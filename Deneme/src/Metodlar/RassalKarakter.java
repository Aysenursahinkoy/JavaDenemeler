package Metodlar;

public class RassalKarakter {


// method basinda find bir seyler yapiyorsa denir get ise hazir databaseden vs aliyorsa.
public static char findRandomKarakter(char ch1,char ch2){
	return (char)(ch1+Math.random()*(ch2-ch1+1));
}
public static char findBuyukHarf(){
	return findRandomKarakter('A','Z');
}
public static char findKucukHarf(){
	return findRandomKarakter('a','z');
}
public static char findRakam(){
return findRandomKarakter('0','9');
}
public static char findHerhangiKarakter(){
	return findRandomKarakter('\u0000','\uFFFF');
}
}