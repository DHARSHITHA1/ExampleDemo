package Question1;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		System.out.println("Enter Monthly Salary");
		
		Scanner s=new Scanner(System.in);
		double salary=s.nextDouble();
		TaxCalculator T = new TaxCalculator();
		double x=T.taxableAmount(salary);
		System.out.println("The taxable amount is : "+ x);

	}

}
