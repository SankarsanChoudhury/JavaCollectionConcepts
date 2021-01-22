package List;

//Author:Sankarsan

import java.util.ArrayList;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		int[] a=new int[3];  //Size is fixed for static array
		
		//Dynamic Array- Array List
		//1.Can contain duplicate values/elements
		//2.Maintains insertion order
		//Synchronization-It is not synchronized i.e. Thread safe.
		//ArrayList is slow as compared to others in Collection
		//It stores the values based on index. 
		
		//This is non-generic as in this ArrayList Object we can store any value.
		//Since this is non-generic the yellow color icon shows against it.
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(true);
		ar.add("Sankarsan");
		
		int ArrayListSize=ar.size();
		
		System.out.println("Size of ArrayList ar is "+ArrayListSize);
		System.out.println("Element present in 3rd position is "+ar.get(2));
		
		//To print all the values from ArrayList
		//1. Using for loop
		//2.Using iterator
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//Non generic vs generic
		//This is generic feature in Java. It was introduced after java 1.5
		//Since this is generic the yellow color icon doesn't show against it.
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
	}
	
	

	
}
