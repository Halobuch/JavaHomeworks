package com.cognizant.tax;

public class EmployeeTax {

	public static void main(String[] args) {
		

		TaxCalculator tc = new TaxCalculator(125000, true);
		tc.calculateTax();
		tc.deductTax();
		tc.validateSalary();

	}

}
