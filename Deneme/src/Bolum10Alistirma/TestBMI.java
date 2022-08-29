package Bolum10Alistirma;

public class TestBMI {
	public static void main(String[] args) {
		BMI bmi = new BMI("ayse", 22, 164, 5, 5);
		 System.out.printf("Name: %s Age: %d weight: %.2f feet: %.2f inches: %.2f\n",
	                bmi.getName(), bmi.getAge(), bmi.getWeight(), bmi.getFeet(), bmi.getInches());
		
	}
}
