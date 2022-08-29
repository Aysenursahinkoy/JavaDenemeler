package bolum12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFile3 {
	public static void main(String[] args) throws Exception {
		File file = new File("sc.txt");
		Scanner input = new Scanner(file);
		
		if(file.exists()){
			System.out.println("dile already exists");
			return;
		}
		PrintWriter output = new PrintWriter(file);
		
		output.print(" John T Smith ");
		output.println(90);
		output.print(" Eric K Jones ");
		output.print(85);
		
		output.close();//calisirken dosyanin silinmesine izin vermez dosya islemi bitince izin verir dosyayi korumak icin yazilir
		
		
	}
}
