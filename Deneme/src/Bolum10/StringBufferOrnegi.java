package Bolum10;

public class StringBufferOrnegi {
	public static void main(String[] args) {
		char[] charArray ={'g','o','o','d'};
		String message =new String(charArray);
		 message ="merhaba ";
		StringBuffer sb =new StringBuffer("merhaba");
		sb.append("merhaba ");
		for (int i = 0; i < 1_000_000; i++) {
			sb.append('a');
			//System.out.println(message);
			
		}
	}
}
