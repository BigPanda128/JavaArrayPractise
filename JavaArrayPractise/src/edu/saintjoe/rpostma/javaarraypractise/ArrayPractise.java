package edu.saintjoe.rpostma.javaarraypractise;

import java.util.ArrayList;

public class ArrayPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] names;
		//names = new String[5];
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Arnold");
		names.add("Luis");
		names.add("Elmo");
		names.add("Luke");
		names.add("Lee");
		names.add("Hernia");
		
		System.out.println(names);
		
		for (String onename : names) {
			if (onename.equals("Elmo")) {
				System.out.println("Found elmo at position " + names.indexOf("Elmo"));
			}
		}

	}//end main

}//end ArrayPractise
