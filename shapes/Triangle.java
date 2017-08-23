package com.cognizant.shapes;

public class Triangle {
	
	public void calculateArea(int sides){
		float realArea = (float) (0.433 * sides * sides);
		System.out.println("The area of the Triangle is " + realArea);
	}

}
