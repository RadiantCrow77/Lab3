//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package com.promineotech;

import java.util.Arrays;

public class Lab3 {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
int[] numArr= new int[] {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
System.out.println("first element in the array is "+numArr[0]);	
		
		// 3. Print out the last element in the array without using the number 5
System.out.println("last element in the array is "+numArr[numArr.length-1]); //length - 1 because it starts at 0		
		
//		// 4. Print out the element in the array at position 6, what happens?
//System.out.println(numArr[6]); // Exception thrown, out of bounds
//		
//		// 5. Print out the element in the array at position -1, what happens?
//System.out.println(numArr[-1]); // Exception thrown, out of bounds
			
		// 6. Write a traditional for loop that prints out each element in the array
for(int i = 0;  i<numArr.length;i++) {
	System.out.println(numArr[i]+" - part 6"); // 1 5 2 8 13 6
}	
			
		// 7. Write an enhanced for loop that prints out each element in the array
for(int nums : numArr) {
	System.out.println(nums+" - part 7"); // 1 5 2 8 13 6
}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
double sum = 0;
for(double i: numArr) {
	sum=sum+i;
}
System.out.println("the sum is "+sum); 
			
		// 9. Create a new variable called average and assign the average value of the array to it
double average = sum/numArr.length; // changed the initialization of sum^ to a double so it doesn't trunk
System.out.println("The average of the array is "+average); // should be 5 ... FIX
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
for(int i:numArr) {
	if(i%2!=0) { // if odd
		System.out.println("Odd number is "+i); // print at current idx
	}
}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
String[] namesArr = {"Sam", "Sally", "Thomas", "Robert"}; // 20 characters
		
		// 12. Calculate the sum of all the letters in the new array
int sumChar = 0;
for(String name: namesArr) {
	sumChar += name.length(); //adds current name to the sum of chars
}
System.out.println("The # of characters in the names array are: "+sumChar);
		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
	greeting("Newton");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

	System.out.println(	greeting2("Bingus"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
	// first method: prints directly in the method but does not return a string
	// 2nd method: is void, so no return, but prints outside the method
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		String letters = "Peepopog"; //8
		int num = 6;
		System.out.println("The string length is greater than the int? "+stringGreater(letters,num));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		String[] stringArr = {"Jack", "Daniel", "DrPepper"};
		String stringTest = "Jack";
		System.out.println("The string "+stringTest+" exists in array "+Arrays.toString(stringArr)+" ? "+stringExists(stringArr, stringTest));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int[] num17 = {2,7,7,1,4};
		System.out.println("The smallest integer in the array is: "+findSmallestNum(num17));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] dbArr = {2.0, 6.6, 7.77};
		System.out.println("The average of the double array is : "+dbAverage(dbArr));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		String[] arrOfStrings= {"Bing","Pog","Dog"};
		System.out.println("String length array: "+Arrays.toString(matchLength(arrOfStrings)));
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		String[] string20 = {"Even", "Odd", "Even", "Odd","Odd","Even"};
		System.out.println("Are there more evens than odds? "+evenGreater(string20));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
String string21 ="red roses run no risk sir on nurses order";

System.out.println(string21+" is a palindrome? "+isPalindrome(string21));
		
		
	}
	

	
	// Method 13:
	public static void greeting(String stringName) {
		System.out.println("Greetings, "+stringName);
	}	

	// Method 14:
public static String greeting2(String stringName) {
	return ("Greetings, "+stringName);
}
	
	// Method 15:
public static boolean stringGreater(String letters, int num) {

	if(letters.length()>num) { // 8>6, true
		return true;
	}
		return false;
	
}


	
	// Method 16:
// 16. Write and test a method that takes an array of string and a string and 
//			returns true if the string passed in exists in the array
public static boolean stringExists(String[] stringArr, String stringTest) {
	for(int i = 0; i<stringArr.length;i++) {
		if(stringArr[i]==stringTest) {
			return true;
		}
	}
	return false;
}
	
	// Method 17:
public static int findSmallestNum(int[] num17) {
	int smallestNum = num17[0];
	for (int i = 0; i<num17.length;i++) {
		if(num17[i]<smallestNum) { // if current num < prev num
			 smallestNum = num17[i]; // set smallest num to currrent num
		}
	}
	return smallestNum;
}
	
	// Method 18:
// 18. Write and test a method that takes an array of double and 
//			returns the average
public static double dbAverage(double[] dbArr) {
	double sum = 0;
	for(double i: dbArr) { // for each i in dbArr
		sum+=i; // add everything in the array
	}
	return sum/dbArr.length;
}
	
	// Method 19:
public static int[] matchLength(String[] arrOfStrings) {
// create a new int array that is the same length as arrOfStrings
	int[] stLengths = new int[arrOfStrings.length];
	for(int i = 0; i<arrOfStrings.length;i++) {
		stLengths[i]=arrOfStrings[i].length();
	}
	return stLengths;
}
	
	// Method 20:
public static boolean evenGreater(String[] string20) {
	int evenLetters = 0;
	int oddLetters = 0;
	for(String i: string20) {
		if(i.length()%2==0) {//even
			evenLetters += i.length();
		}else { //odd
			oddLetters += i.length();
		}
	}
	if(evenLetters>oddLetters) {
		return true;
	}
	return false;
}
	
	// Method 21:
// 21. Write and test a method that takes a string and 
//			returns true if the string is a palindrome
public static boolean isPalindrome(String string21) {
	 string21 = string21.replaceAll("\\s",""); //remove spaces from the string
	 
	// palindrome if word is spelled the same forwards and backwards
	// 1st el = 1st to last el
	// 2nd el = 2nd to last el

	for(int i = 0; i<string21.length()/2;i++) {// palindrome, only go 1/2 string
		if(string21.charAt(i)!=string21.charAt(string21.length()-i-1)) { 
			// ex: if at 0th index - front, i=0
			// back - > when i = 0, string21.lenth() gives an out of bounds exception, so subtract one from that
			// back - > subtracting i because if i = 2, we want it to be 2nd to last position
		return false;
		}
	}
	return true;
	
}


}