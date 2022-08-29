package bolum12;

import java.util.Scanner;

public class ReadFromURL {
	public static void main(String[] args) {
		System.out.println("Enter a URL:");
		String URLStirng = new Scanner(System.in).next();//Burasi klavye yani console dan okumak icin

		try {
			java.net.URL url = new java.net.URL(URLStirng);
			int count = 0;
			Scanner input = new Scanner(url.openStream());//burasi gidip o web sayfasindan okumak icin
			while (input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);//satirlari okumak icin
				count += line.length();
			}
			System.out.println("the file size is " + count + "characters");
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("IO Errors");
		}
	}
}
