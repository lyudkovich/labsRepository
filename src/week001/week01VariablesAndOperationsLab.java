//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week001;

public class week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		
		System.out.println("Week 01 lab");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
			int availableSeats = 67;
		
		// 2. Create a variable to hold the cost of groceries at checkout
			double costOfGroceries = 34.67;
		
		// 3. Create a variable to hold a person's middle initial
			char middleInitial = 'C';

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
			boolean itsHotOutside = false;

		
		// 5. Create a variable to hold a customer's first name
			String firstName = "Sam";
		
		// 6. Create a variable to hold a street address
			String streetAddress = "95 Nahant St.";
		

		// 7. Print all variables to the console
			System.out.println("Available Seats = " + availableSeats);
			System.out.println("Cost Of Groceries = " + costOfGroceries);
			System.out.println("Middle Initial = " + middleInitial);
			System.out.println("itsHotOutside = " + itsHotOutside);
			System.out.println("First Name = " + firstName);
			System.out.println("Street Address = " + streetAddress);
		

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
			availableSeats = availableSeats - 2;
			System.out.println("Available Seats = " + availableSeats);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
	 		costOfGroceries = costOfGroceries + 2.15;
	 		System.out.println("Cost Of Groceries = " + costOfGroceries);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
	 		middleInitial = 'D';
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
	 		itsHotOutside = !itsHotOutside;


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
	 		String fullName = firstName + " " + middleInitial + " " + "Smith";
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
	 		System.out.println("Hi, my name is "+ fullName + " and I live at " + streetAddress);

		
		
	}
}