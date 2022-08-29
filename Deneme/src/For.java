import java.util.ArrayList;

public class For {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 1_000_000_000; i++) {
			list.add(i+"");
		}
	}
}
