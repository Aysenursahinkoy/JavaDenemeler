package Bolum4;

import java.util.Scanner;

public class Soru7 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("dairenin yaricapi: ");
        double r = input.nextDouble();
       

        System.out.println("kordinatlar...");
        for (int i = 0; i < 5; i++) {

            double x = r * Math.sin(2.0 * Math.PI / 5.0 * i);
            double y = r * Math.cos(2.0 * Math.PI / 5.0 * i);
            System.out.println(x + " " + y);
	}
}
}
