//HEADER
//Program Name: Chapter 5 Exercise 1-4
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 11/3/2019
//Description: Output for exercises one through four, programming for exercise four.



package cs160_wk5_lec2_ProgramFlow;

public class Main {

	public static void main(String[] args) {
		checkFermat(5,3,2,1);
		
		
		
	}			
		//Exercise 4 "checkFermat"
		public static void checkFermat(int a, int b, int c, int n) {
			if ((n > 2) && (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n))){
				System.out.println("Holy smokes, Fermat was wrong!");
				
			}
			else {
				System.out.println("No, that doesn’t work");
			}
						
		}
	}


	

/*Exercise One, rewrite with a single if statement

if (x > 0 && x < 10) {

	System.out.println("positive single digit number.");

  
  Exercise Two: stack diagram
  	1. main - void
  	   zoop - just for, 5  
  	   clink - 2*2 (4)
       ping - not
  	   zoop - breakfast, 4
  	
    2.	Output:
  		just for
		any not more 
		It's breakfast 
		!
	
	Exercise three: stack diagram for section 5.8
			n == 4
			nLines 4
			nLines 3
			nLines 2
			nLines 1
			nLines 0
	
	Exercise four: checkFermat
			
		
		public static void checkFermat(int a, int b, int c, int n) {
			if ((n > 2) && (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n))){
				System.out.println("Holy smokes, Fermat was wrong!");
				
			}
			else {
				System.out.println("No, that doesn’t work");
				
	public static void main(String[] args) {
		checkFermat(5,3,2,1);
		
		Output: No, that doesn’t work
		

*/
