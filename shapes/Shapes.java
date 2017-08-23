package com.cognizant.shapes;

public class Shapes {
	
	private int numberOfSides;
	
	public Shapes(int shape){
		this.numberOfSides = shape;
	}
	
	public void calculateShapeArea(int sideLength){
		
		//If you want to use Switch Cases
		/*switch(numberOfSides){
		case 1:
			Circle c = new Circle();
			c.calculateArea(sideLength);
			break;
			
		case 3:
			Triangle t = new Triangle();
			t.calculateArea(sideLength);
			break;
			
		case 4:
			Squares sq = new Squares();
			sq.calculateArea(sideLength);
			break;
			
		default:
			System.out.println("No Shapes Present");
		}*/
		
		if(numberOfSides == 1){
			Circle c = new Circle();
			c.calculateArea(sideLength);
		
		}
		else if(numberOfSides == 3){
			Triangle t = new Triangle();
			t.calculateArea(sideLength);
		
		}
		else if(numberOfSides == 4){
			Squares sq = new Squares();
			sq.calculateArea(sideLength);
			
		}
		else{
			System.out.println("No Shapes Present");
		}
		
	}
	
	public static void main(String args[]){
		Shapes sh = new Shapes(3);
		sh.calculateShapeArea(12);
	}

}
