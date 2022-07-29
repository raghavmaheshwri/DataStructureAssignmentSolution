package com.gl.driver;

import com.gl.service.function;

public class ConstructionPlan {

	// Driver Code
	public static void main(String[] args) {

		function constructionService = new function();
		
		// Floors  Size 
		int size = constructionService.GetUserInput();

		// Line
		constructionService.line();

		if (size > 0) {
			// Inserting Values to Stack
			constructionService.insertValue(size);
			constructionService.line();
			// Calling Function to get order of Construction
			constructionService.getOrderOfConstruction(size);
		} else {
			System.out.println("Total no of floors Can't be Zero or can't be Negative !!");
		}

	}

}
