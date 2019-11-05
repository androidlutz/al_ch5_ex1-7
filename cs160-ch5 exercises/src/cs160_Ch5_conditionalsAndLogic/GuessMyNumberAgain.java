//HEADER
//Program Name: Chapter 5 Exercise 5
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 11/3/2019
//Description: 99 Bottles exercise


package cs160_Ch5_conditionalsAndLogic;



import java.util.Random;
import java.util.Scanner;
public class GuessMyNumberAgain {
	static Scanner enter = new Scanner(System.in);

	
	
	public static void main(String[] args) {
		 Random random = new Random();
	      int answer = random.nextInt(100 + 1);
	      guessNumber(answer);
	}  
	
	public static void guessNumber(int answer) {
		
		//Scanner scan = new Scanner(System.in);
		 System.out.println("I'm thinking of a number between 1 and 100, (including both), Can you guess what it is?");
	        System.out.println("Type a number: ");
	        
	        int yourNumber = enter.nextInt();
	        
	        
	        if(yourNumber == answer) {
	        	System.out.println("That is correct");
	        	
	        }
	        //compare the two numbers
	        if(yourNumber < answer) {
	        	System.out.println("Too low, guess again");
		       int newguessNumber = enter.nextInt();

	        }
	        if 
	        	(yourNumber > answer) {
	        	System.out.println("Too high, guess again");
		        int newguessNumber = enter.nextInt();

	        }
	        else {
	        	guessNumber(answer);
	        	
	        }
	        
	
	
	
}	
	
}
