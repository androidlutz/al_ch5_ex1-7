
//HEADER
//Program Name: Chapter 5 Exercise 7
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 11/3/2019
//Description: Guess my number redux





package cs160_Ch5_conditionalsAndLogic;


import java.util.Random;
import java.util.Scanner;


public class guessMyNumberAgain {

	public static void main(String[] args) {
       
		        
				Scanner scan =	new Scanner(System.in);
				
				
				//Receive input from user
		        System.out.println("I'm thinking of a number between 1 and 100, (including both), Can you guess what it is?");
		        System.out.println("Type a number: ");
		        int Yournumber = scan.nextInt();
		        System.out.println("Your guess is: " + Yournumber); 
		        		        
		        
		           // Generate a random number
		        Random random = new Random();
		        int Generatednumber = random.nextInt(100) + 1;
		     
		            	
		        public static void keepGuessing(int guess) {
		        		        
		       if (Yournumber < Generatednumber) { 
		        	System.out.println("Too low, guess again");
		        	int guessagain = scan.nextInt();	
		         }		       
		         //else {
		        	//keepGuessing();
		         //}		        	
		        	if (Yournumber > Generatednumber) {		        		
		        	}
		        	 System.out.println("Too high, guess again");	          
		        	 int guessagain = scan.nextInt();
		         
		        	 //else {
				        	//keepGuessing();
				        // }
		        	
		        	if(Generatednumber == Yournumber) {
					System.out.println("Congratulations, you guessed correctly!" + Generatednumber); 
		       
		        	}
	}
}
}	
		        	
		        	
		       // System.out.println("The number I was thinking of is: " + Generatednumber);   
		        
		       
		        
		        
		        
		        
		        
		        /*What's the difference?
		          System.out.println("You were off by: " + Math.abs(Yournumber - Generatednumber));        
		          System.out.println("Guess again!");
			        int newGuess = scan.nextInt();
			   */
			      
	
/*
 * i want to import a scanner
 * i want to print a message "can you guess my number?" so that the user will input a number
 * I want to prompt the user to input a number into the console so that a number will be input
 * I want to print the message "Your guess is"  plus the input number
 * I want to generate a random number so that it can be compared to the guessed number
 * I want to compare the generated number to the guessed number so that a message can be printed
 * I want to determine if the input is greater than the random number so that
 * "Your number is too high, guess again" can be printed.
 * I want to determine if the input is less than the generated number so that the message
 *  "Your number is too low, guess again" can be printed
 * I want to be able to input a new number after each message
 *  so that is can be compared to the original random number.
 *  I want to repeat the process until the random number is guesses.
 *  I want the process to end when the random number is equal to the guessed number.
 *  I want to print "You are correct, the number i was thinking of is -the random number-"
 *  so that the progam will end.
 * 
 */
  
