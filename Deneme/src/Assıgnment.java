

import java.util.Scanner;
import java.io.*;

public class Assýgnment {
	public static void main(String[] args) {
		Scanner input=null;
		PrintWriter output=null;
		
		try{input=new Scanner(new File("input.txt"));
			output=new PrintWriter("Output.txt"); }
		catch(FileNotFoundException e){
			System.out.println("Error: "+e.getMessage());
			System.exit(0);
		
		
		}
		double width;
		double length;
		for (int i = 1;  input.hasNextLine(); i++) {
			width = input.nextDouble();
			length = input.nextDouble();
			if(width==length){
				output.println("Rectangle ("+i+")-ERROR, this is square not rectangle!");
			
			}
			else if(width<0|| length<0){
				output.println("Rectangle ("+i+")-ERROR, invalid width or length number!!!");
			}
			else{
				output.println("Rectangle ("+i+")-Area = "+(width*length));
			}
		}
		input.close();
		output.close();
		
	}
}
