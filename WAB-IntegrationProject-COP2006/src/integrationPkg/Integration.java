package integrationPkg;

import java.util.Scanner;

//Wyatt Byroade
//Integration Project - COP 2006
//Fall 2017
//SP1 - September 30, 2017


//TODO: Work on more complex cipher method, reduce duplicate code

public class Integration {
	public static Scanner scan;

// declaring variables of Java built-in(primitive) data types
// essentially variables are blocks of memory allocated to store certain values
// the size and type of values dictate which variable type should be used

// int - 32 bit signed integer, values range from -2^31 to 2^31 or unsigned 0 to
// (2^32)-1
	static int encodeOffset = 10;
	static int decodeOffset = 16;

	
//byte - 8 bit signed integer, values range from -128 to 128
	byte unusedByte = 0;
// short - 16 bit signed integer, values range from -32,768 to 32,767
	short unusedShort = 0;
// long - 64 bit signed integer, values range from -2^63 to (2^63)-1 or unsigned
// 0 to (2^64)-1
	long unusedLong = 0;
// float - 32 bit floating point number
	float unusedFloat = 0.1f;
// double - 64 bit floating point number
	double unusedDouble = 0.1;
// char - 16-bit unicode character ranges from \u0000 to \uffff
	char unusedChar = 'A';
// boolean - true or false - one bit
	boolean unusedBoolean = false;

	public static void main(String[] args) {
// instantiate a new Scanner object as well as a new WeakCrypt object
		Scanner scan = new Scanner(System.in);
		WeakCrypt thisCryptObj = new WeakCrypt();
		

// display welcome message and initial prompt, then receive user input
		System.out.println("Welcome to my integration project.");
				
// MATHEMATICAL OPERATION: integer division
		System.out.println("First, here's an unsolicited mathematics demo:");
		int testDividend1 = 70;
		int testDivisor1 = 10;
// actual integer division of integers that divide evenly
		int testQuotient1 = testDividend1/testDivisor1;
//  mod operation to see if integers that divide evenly
		int testRemainder1 = testDividend1%testDivisor1;
		if(testRemainder1 == 0) System.out.println(testDividend1 + " / " +
		      testDivisor1 + " = " + testQuotient1 + ".");
		else System.out.println(testDividend1 + " / " +
		      testDivisor1 + " = " + testQuotient1 + " with remainder " +
		      testRemainder1 + ".");
		  
		int testDividend2 = 70;
		int testDivisor2 = 17;
// actual integer division of integers that do not divide evenly
		int testQuotient2 = testDividend2/testDivisor2;
//  mod operation to see if integers that divide evenly
		int testRemainder2 = testDividend2%testDivisor2;
		if(testRemainder2 == 0) System.out.println(testDividend2 + " / " +
		      testDivisor2 + " = " + testQuotient2 + ".");
		else System.out.println(testDividend2 + " / " +
		      testDivisor2 + " = " + testQuotient2 + " with remainder " +
		      testRemainder2 + ".");
				
		System.out.println("Would you like to encode or decode text?:\n" + 
		      "1-encode\n2-decode");
		int encodeDecodeChoice = scan.nextInt();
		scan.nextLine();

// if/else logical blocks here
		if (encodeDecodeChoice == 1) {
			System.out.println(
					"You selected to encode text.\nEnter text to encode:");
			String encodeInput = scan.nextLine().toUpperCase();
// call encodeText() method with arguments encodeInput and encodeOffset
			thisCryptObj.encodeText(encodeInput, encodeOffset);
			System.out.println(thisCryptObj.getEncodedText());
		} else if (encodeDecodeChoice == 2) {
			System.out.println(
					"You selected to decode text.\nEnter text to decode:");
			String decodeInput = scan.nextLine().toUpperCase();
// call decodeText() method with arguments decodeInput and decodeOffset
			thisCryptObj.decodeText(decodeInput, decodeOffset);
			System.out.println(thisCryptObj.getDecodedText());
		} else {
			System.out.println("You have selected an invalid option.");
		}
		scan.close();

		  
		
	}
}
