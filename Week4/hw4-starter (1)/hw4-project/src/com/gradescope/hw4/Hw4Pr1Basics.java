package com.gradescope.hw4;

/**
 * Fill in the body of the methods below based upon the specification provided.
 * It may be helpful to look at the test cases provided in Hw4Pr1BasicsTest.java
 * to understand the intended behavior of the method.
 * 
 * Most of the content is based upon problems at CodingBat.com Other content is
 * developed by Mudd faculty.
 */

public class Hw4Pr1Basics {
	/*************************************************************
	 * STOP - If you have not read the directions, do that first!
	 **************************************************************/

	/**
	 * The parameter weekday is true if it is a weekday, and the parameter vacation
	 * is true if we are on vacation. We sleep in if it is not a weekday or we're on
	 * vacation. Return true if we sleep in.
	 * 
	 * Source: http://codingbat.com/prob/p187868
	 */
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (vacation || !weekday) {
			return true;
		}
		return false; 
	}

	/**
	 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is
	 * 10.
	 * 
	 * Source: http://codingbat.com/prob/p182873
	 */
	public static boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		}
		return false; 
	}

	/**
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
	 * if each is smiling. We are in trouble if they are both smiling or if neither
	 * of them is smiling. Return true if we are in trouble.
	 * 
	 * Source: http://codingbat.com/prob/p181646
	 */
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if ((bSmile && aSmile) || (!bSmile && !aSmile)) {
			return true;
		}
		return false;
	}

	/**
	 * Given 2 int values, return true if either of them is in the range 10..20
	 * inclusive.
	 * 
	 * Source: http://codingbat.com/prob/p144535
	 */
	public static boolean in1020(int a, int b) {
		if ((a <= 20 && a >= 10) || (b <= 20 && b >= 10)) {
			return true;
		}
		return false; 
	}

	/**
	 * Given two temperatures, return true if one is less than 0 and the other is
	 * greater than 100.
	 * 
	 * Source: http://codingbat.com/prob/p192082
	 */
	public static boolean icyHot(int temp1, int temp2) {
		if ((temp1 > 100 && temp2 <= 0) || (temp1 <= 0 && temp2 > 100)) {
			return true;
		}
		return false;
	}

	/**
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	 * Given 3 int values, return true if 1 or more of them are teen.
	 * 
	 * Source: http://codingbat.com/prob/p178986
	 */
	public static boolean hasTeen(int a, int b, int c) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
			return true;
		}
		return false;
	}

	/**
	 * Given two non-negative int values, return true if they have the same last
	 * digit, such as with 27 and 57. Note that the % "mod" operator computes
	 * remainders, so 17 % 10 is 7.
	 * 
	 * Source: http://codingbat.com/prob/p125339
	 */
	public static boolean lastDigit(int a, int b) {
		if (a % 10 == b % 10) {
			return true;
		}
		return false; 
	}

	/**
	 * Given 2 int values, return true if one is negative and one is positive.
	 * Except if the parameter "negative" is true, then return true only if both are
	 * negative.
	 * 
	 * Source: http://codingbat.com/prob/p159227
	 */
	public static boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			if (a < 0 && b < 0) {
				return true;
			}
			return false;
		}else{
			if ((a < 0 && b >= 0) || (a >= 0 && b < 0)) {
				return true;
			}
			return false;
		}
	}

	/**
	 * Given 2 int values, return the largest.
	 * 
	 * Source: Mudd faculty
	 */
	public static int calculateMax(int a, int b) {
		// This implementation is provided as an example of using Math.max
		// -- no need to change this one :-)
		return Math.max(a, b);
	}

	/**
	 * Given 4 int values, return the largest.
	 * 
	 * Source: Mudd faculty
	 */
	public static int calculateMax(int a, int b, int c, int d) {
		int max1 = Math.max(a, b);
		int max2 = Math.max(c, d);

		return Math.max(max1, max2); 
	}

	/**
	 * Given 2 int values, return the value with the highest absolute value.
	 * 
	 * Source: Mudd faculty
	 */
	public static int calculateAbsMax(int a, int b) {
		if (Math.abs(a) > Math.abs(b)){
			return a;
		}
		return b; // TODO: Implement calculateAbsMax
	}

	/**
	 * Given the radius of a circle, calculate its perimeter.
	 * 
	 * Source: Mudd faculty
	 */
	public static double calculatePerimeter(double radius) {
		
		return Math.PI * 2 * radius; // TODO: Implement calculatePerimeter
	}

	public static void main(String[] args) {
		System.out.println("Message from the CS60 teaching team:");
		System.out.println("Run the file Hw4Pr1BasicsTest.java not Hw4Pr1Basics.java");
		System.out.println("-------------------------------------------");
		System.out.println("Running a Java file calls the main method");
		System.out.println("You can find this text of this message");
		System.out.println("at the bottom of the file: Hw4Pr1Basics.java");

	}

}
