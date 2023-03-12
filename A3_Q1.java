// -------------------------------------------------------
// Assignment 3
// For COMP 248 Section 2222-R – Fall 2022
// --------------------------------------------------------
// Importing the scanner so that the user can input using his keyboard after opening the scanner
import java.util.Scanner;
public class A3_Q1 {

	public static void main(String[] args) {
		// ********************************************************************
		//This program allows the user to encrypt text he/she inputs.
		//This code ignores all useless whitespace and converts the text
		//from encrypted to decrypted and vice-versa.
		// ********************************************************************
		Scanner keyIn = new Scanner(System.in);
		System.out.println("Welcome to the 3D-Space Encryption-Decryption Program:");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("\nPlease enter your plain text below:");
		//user input of the whole line
		String text = keyIn.nextLine();
		//removes leading and trailing whitespace
		text = text.trim();
		//find the length then subtracting 1 gives us the max index of a string
		int l = text.length()-1;
		//initializing the new string
		String newText = "";
		//separated the the 2 cases of even and odd numbers
		//if remainder is =0 then it's even
		if (text.length()% 2 == 0)
			//initialized i to 0, and condition that i is less greater than the max index,
			//so it swaps only until the end character. I, then add to the s string by block of 2 swapped characters.
			for (int i=0; i < l ; i+=2) 
			{
				newText+=text.charAt(i+1);
				newText+=text.charAt(i);
			}
		//if remainder is !=0 then it's odd
		else if (text.length() % 2 != 0) 
			{
				//since the first char stays the same when it's odd, we keep the addition outside of the loop
			newText += text.charAt(0);
				for (int i=0; i < l; i+=2) 
				{
					//since we're working with odd, we need to start at i=1
					newText+=text.charAt(i+2);
					newText+=text.charAt(i+1);
				}
			}
		System.out.println("\nKindly find below your encrypted text output:" + "\n" + newText);
		System.out.println("\nThank you for your contribution to this Space Project.");
		keyIn.close();
	}

}
