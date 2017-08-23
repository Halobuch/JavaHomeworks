package com.cognizant.tax;

public class TaxCalculator {

	float basicSalary, tax;

	boolean citizenship;

	TaxCalculator(float basicSalary, boolean citizenship) {

		this.tax = 0;

		this.basicSalary = basicSalary;

		this.citizenship = citizenship;

	}

	public void calculateTax() {

		tax = 30 * basicSalary / 100;

		System.out.println("The Tax of the Employee for the " + basicSalary + "  is " + tax);

	}

	public void deductTax() {

		int nettSalary = (int) (basicSalary - tax);

		System.out.println("The net Salary of the employee is " + nettSalary);

	}

	public void validateSalary() {

		if (basicSalary > 50 && citizenship == true) {
			System.out.println("The salary and citizenship eligibility: " + citizenship);

		}

	}

}