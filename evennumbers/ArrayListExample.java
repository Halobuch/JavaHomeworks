package com.cognizant.evennumbers;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {
	
	ArrayList<Integer>A1;
	ArrayList<Integer>A2;
	
	public ArrayListExample(){
		A1 = new ArrayList<Integer>();
		A2 = new ArrayList<Integer>();
	}
	
	public List<Integer> storeEvenNumbers(int N){
		
		for(int i = 2; i <= N; i+=2){
			A1.add(i);
			//System.out.println(A1 + " ");
		}
		//Printing Array of Even Numbers
		System.out.println(A1 + " ");
		//Returning Array of Even Numbers
		return A1;		
	}
	
	public List<Integer> printEvenNumbers(){
		
		for(Integer list : A1){
			//Adding even numbers multiplied by 2 to the A2 list
			A2.add(list * 2);
			//Printing the multiplied list
			System.out.print(list * 2 + " ");
		}
		
		return A2;
	}
	
	public int retrieveEvenNumber(int N){
		
		for(Integer list : A1){
			if(list == N){
				return list;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		

		ArrayListExample ae = new ArrayListExample();
		ae.storeEvenNumbers(100);
		ae.printEvenNumbers();
		System.out.println("\n");
		System.out.println(ae.retrieveEvenNumber(300));

	}

}
