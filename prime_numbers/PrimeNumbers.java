package com.cognizant.prime_numbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		
		//Set limit to last number to test if a prime.
		int limit = 150;
		//loop through the numbers one by one
		for (int i=1; i < limit; i++){
			//set boolean to true for condition
			boolean isPrime = true;
			//check to see if number is a prime
			for(int j=2; j < i; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.print(i + ",");
		}
		

	}

}
