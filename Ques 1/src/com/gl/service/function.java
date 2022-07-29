package com.gl.service;

import java.util.Scanner;
import java.util.Stack;

public class function {

	private static final Stack<Integer> stack = new Stack<Integer>();
	private static final Scanner sc = new Scanner(System.in);

	// Inserting Items to Stack
	public void insertValue(int size) {
		for (int index = 1; index <= size; index++) {
			System.out.print("Enter the floor size given on day " + (index) + " : ");
			int value = sc.nextInt();

			if (stack.contains(value)) {
				System.out.println("You Have Already added this Size \n");
				index--;
			} else if (value > 0 && value <= size) {
				stack.push(value);
			} else {
				System.out.println("Floor size should be greater than Zero or smaller than " +size+"\n");
				index--;
			}
		}
	}

	// Function for Order of Construction Floor
	public void getOrderOfConstruction(int size) {

		System.out.println("The order of construction is as follows:");
		boolean flag;
		int indexOfArray = size;
		for (int index = 0; index < size; index++) {
			flag = false;
			System.out.println("Day " + (index + 1) + " : ");
			while (indexOfArray >= 1 && stack.indexOf(indexOfArray) <= index) {
				flag = true;
				System.out.print(indexOfArray + " ");
				indexOfArray--;
			}

			// For Blank Space
			if (flag == true || flag == false) {
				System.out.println("");
			}
		}
	}

	// For Printing Break or Dashed Line
	public void line() {
		System.out.println("\n------------------------");
	}

	// Get Floor Size
	public int GetUserInput() {
		System.out.print("Enter the total no of floors in the building : ");
		int size = sc.nextInt();
		return size;
	}
}
