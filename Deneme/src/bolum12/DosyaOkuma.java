package bolum12;

import java.io.File;
import java.util.Scanner;

public class DosyaOkuma {
	public static void main(String[] args) throws Exception {
		File file = new File("sc.txt");
		try (Scanner input = new Scanner(file);) {

			while (input.hasNext()) {
				String f = input.next();
				System.out.println(f);

			}

		}

	}
}