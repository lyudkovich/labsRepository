package week03;

import java.util.Arrays;

//
//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject: Arrays & Methods
//Java Week 03 Lab
//

public class Week03ArraysAndMethodsLab {
	

	public static void main(String[] args) {
			
		//
		// Arrays:
		//

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] numbers = {1, 5, 2, 8, 13, 6};
	
		// 2. Print out the first element in the array
		System.out.println("first element in the array: " + numbers[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println("last element in the array: " + numbers[numbers.length -1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//  System.out.println("last element in the array: " + numbers[6]);
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println("last element in the array: " + numbers[-1]);
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("Traditional for loop that prints out each element in the array");
		for (int i=0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("Enhanced for loop that prints out each element in the array");
		for (int number : numbers) {
			System.out.println(number);
			}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int number : numbers) {
			sum += number;
			}
		System.out.println("sum : " + sum);

			
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum / numbers.length;
		System.out.println("average : " + average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int number : numbers) {
			if ( number % 2 == 0 ) {
				System.out.println(number);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas","Robert"};
		
		
		// 12. Calculate the sum of all the letters in the new array
		int sumLetters = 0;
		for (String name : names) {
			sumLetters += name.length();
		}		
		System.out.println("sum of all the letters in the new array " + sumLetters);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		printGreeting("Leo");

		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(createGreeting("Leo") );
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(compareNumLetters("Leo", 5) );
		System.out.println(compareNumLetters("Leonid", 5) );
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		String[] names1 = {"Sam", "Sally", "Thomas","Robert"};
		System.out.println(ifExistsInArray(names1, "Leo") );
		System.out.println(ifExistsInArray(names1, "Sam") );
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int[] numbers1 = {1, 5, 2, 8, 13, 6};
		System.out.println(getSmallestNumber(numbers1) );
		
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		double[] numbers2 = {1.57, 5, 2, 8, 13.26, 6};
		System.out.println("average of array of doubles" );	
		System.out.println(getArrayAverage(numbers2) );		
		
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		String[] names3 = {"Sam", "Sally", "Thomas","Robert"};
		int[] charCountsArray = lengthStrArray(names3);
		
		for (int i=0; i < names3.length; i++) {
			System.out.println(names3[i] + " : " + charCountsArray[i]);
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		
		String[] names4 = {"Sam", "Sally", "Thomas","Robert", "Leo", "Bob"};
		System.out.println("isEvenGreaterOdd : " + isEvenGreaterOdd(names4) );

		
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		
		System.out.println("isPalindrome : " + isPalindrome("ajshlaa") );
		System.out.println("isPalindrome : " + isPalindrome("madam") );
	}
	

	
	// Method 13:
	
	public static void printGreeting( String name) {
		System.out.println("Hello " + name);
	}


	// Method 14:
	public static String createGreeting(String name) {
		return "Hi " + name;
	}	

	
	// Method 15:
	// Write and test a method that takes a String and an int and 
	//			returns true if the number of letters in the string is greater than the int
	public static boolean compareNumLetters(String name, int num) {
		if (name.length() > num) {
			return true;
		}
		else {
			return false;
		}
	}		
	
	
	// Method 16:
	// 16. Write and test a method that takes an array of string and a string and 
	//			returns true if the string passed in exists in the array
	public static boolean ifExistsInArray(String[] stringArray, String s) {
		
		if ( Arrays.stream(stringArray).anyMatch(s::equals) ) {
			return true;
		}
		else {
			return false;
		}
	}	
	
	// Method 17:
	// 17. Write and test a method that takes an array of int and 
	//			returns the smallest number in the array
	public static int getSmallestNumber( int[] intArray) {
		return Arrays.stream(intArray).min().getAsInt();
	}
	
	
	// Method 18:
	// 18. Write and test a method that takes an array of double and 
	//			returns the average
	
	public static double getArrayAverage( double[] doubleArray) {
		return Arrays.stream(doubleArray).sum() / doubleArray.length ;
	}	
	
	
	// Method 19:
	// 19. Write and test a method that takes an array of Strings and 
	//			returns an array of int where each element
	//			matches the length of the string at that position
	
	public static int[] lengthStrArray( String[] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int i=0; i < stringArray.length; i++) {
			intArray[i] = stringArray[i].length();
			//System.out.println("lengthStrArray " +  i + " : " +stringArray[i] + " : " + intArray[i]);
		}
		
		return intArray;

	}		

	
	// Method 20:
	// 20. Write and test a method that takes an array of strings and 
	//			returns true if the sum of letters for all strings with an even amount of letters
	//			is greater than the sum of those with an odd amount of letters.
	
	public static boolean isEvenGreaterOdd( String[] stringArray) {
		
		int countEven = 0;
		int countOdd = 0;
		
		for (String s : stringArray) {
			
			if ( s.length() % 2 == 0 ) {
				countEven += s.length();
			}
			else {
				countOdd += s.length();
			}
			
		}
		
		System.out.println("countEven : "  + countEven);
		System.out.println("countOdd : "  + countOdd);		
		
		if ( countEven > countOdd ) {
			return true;
		}
		else {
			return false;
		}

	}		
	
	// Method 21:
	// 21. Write and test a method that takes a string and 
	//			returns true if the string is a palindrome
	
	public static boolean isPalindrome(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
	}
	

}

