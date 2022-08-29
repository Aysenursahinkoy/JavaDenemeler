package bolum12;

import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a URL:");
		String url = input.nextLine();
		crawler(url);
		input.close();
	}

	public static void crawler(String StartingURL) {
		ArrayList<String> listOfPendingURLs =new ArrayList<>();
		ArrayList<String> listOfTraverseURLs = new ArrayList<>();
		
		listOfPendingURLs.add(StartingURL);
		while(!listOfPendingURLs.isEmpty() && listOfTraverseURLs.size()<=100){
			String urlString = listOfPendingURLs.remove(0);
			if(listOfTraverseURLs.contains(urlString)){
				listOfTraverseURLs.add(urlString);
				System.out.println("craw "+urlString);
				
				for (String s : getSubURLs(urlString)) {
					if(!listOfTraverseURLs.contains(s)){
						listOfTraverseURLs.add(s);
					}
				}
			}
		}
	}

	public static ArrayList<String> getSubURLs(String urlString) {
		ArrayList<String> list = new ArrayList<>();
		
		try{
			java.net.URL url = new java.net.URL(urlString);
			Scanner input = new Scanner(System.in);
			int current = 0;
			while(input.hasNext()){
				String line = input.nextLine();
				current = line.indexOf("http:",current);
				while(current > 0){
					int endIndex = line.indexOf("\"",current);
					if(endIndex > 0){
						list.add(line.substring(current,endIndex));
						current = line.indexOf("http:",endIndex);
					}else
						current = -1;
					
				}
			}
		}
			catch(Exception ex){
				System.out.println("Error: "+ex.getMessage());
			}
			return list;
		}
		
	}


