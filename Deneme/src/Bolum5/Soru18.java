package Bolum5;

public class Soru18 {
	public static void main(String[] args) {
		  extracted();

	      extracted2();

	        extracted3();

	        extracted4();
	       
	}

	private static void extracted4() {
		System.out.println("\n\nPattern D");
		for (int i = 1; i <= 6; i++)    {
		    for (int k = i; k > 1; k--){
		        System.out.print("  ");
		    }
		    for (int j = 1; j <=  7 - i; j++) {
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
	}

	private static void extracted3() {
		System.out.println("\n\nPattern C");
		for (int i = 1; i <= 6; i++)    {
		    for (int k = 1; k <= 6 - i; k++){
		        System.out.print("  ");
		    }
		    for (int j = 1; j <=  i; j++) {
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
	}

	private static void extracted2() {
		System.out.println("\n\nPattern B");
		for (int i = 1; i <= 6; i++)    {
		    for (int j = 1; j <=  7 - i; j++) {
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
	}

	private static void extracted() {
		System.out.println("\n\nPattern A");
	        for (int i = 1; i <= 6; i++)    {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	}
}
