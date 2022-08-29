package Bolum9Alistirma;
import java.util.Scanner;
import Bolum9Alistirma.LinearEquation;
public class Soru12 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
	        double[][] points = new double[4][2];
	        for (int i = 0; i < points.length; i++)
	            for (int j = 0; j < points[i].length; j++)
	                points[i][j] = input.nextDouble();

	        LinearEquation linear = new LinearEquation();

	        if (linear.isSolvable()) {
	            System.out.println("The intersecting point is at (" + linear.getX() + ", " + linear.getY() + ")");
	        } else {
	            System.out.println("The two lines are parallel");
	        }

	    }
	
		
		
	}

