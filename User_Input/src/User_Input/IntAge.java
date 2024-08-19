

package User_Input;

import java.util.Scanner;

public class IntAge {

	public static void main(String[] args) {
		
		//Create a Scanner object to get input from the user
		Scanner input = new Scanner(System.in); 
		
		//Declare a variable for Age
		int age;                                
		
		
		//Write a statement that show output to the user with following sentence "Welcome to the Age Program"
		System.out.println("Welcome to the Age Program");
		
		//Run the program to assure above statements has no syntax or logic errors then continue coding
		
		//Write a statement that show output to the user with following sentence " Please enter your current age: "
		System.out.println("Please enter your current age: ");
		
		//write a code to store user input into variable age
		age = input.nextInt();                                      
		
		//Write a statement that show output to the user with following sentence " The age that you have entered is" and concatenate the string using (+) sign to variable "age"  
		System.out.println("The age that you have entered is "+ age);
		
	}
	
}
