package Bolum9Alistirma;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(){
		
	}

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getDiscriminant() {

		return (Math.pow(b, 2) - (4 * a * c));
	}

	public double getRoot1() {
		if (getDiscriminant() > 0) {
			return -b + (Math.sqrt(getDiscriminant())) / (2 * a);
		} else {
			return 0;
		}

	}

	public double getRoot2() {
		if (getDiscriminant() > 0) {
			return -b - (Math.sqrt(getDiscriminant())) / (2 * a);
		} else {
			return 0;
		}
	}

	public String toString(){
		if(getDiscriminant()>0){
			return "denkelemin 2 koku var kok1="+getRoot1( )+" ve "+getRoot2();
			
		}
		else if(getDiscriminant()==0){
			return "denkelmin tek koku var kok ="+getRoot1();
		}
		else{
			return "denklemin koku yok";
		}
	}
}
