//HEADER
//Program Name: Chapter 5 Exercise 6
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 11/3/2019
//Description: Order of operation exercise



package cs160_wk5_lec2_ProgramFlow;

public class ExerciseSix {
	
	public static void main(String[] args) {   //1
		  zippo("rattle", 13);   //2
		  
	}	

    public static void baffle(String blimp) {  //8
        System.out.println(blimp);  //9
        zippo("ping", -5);  //10
    }

    public static void zippo(String quince, int flag) {   //3, 11
        if (flag < 0) {  //4, 12
            System.out.println(quince + " zoop");  //13
        } else {  //5
            System.out.println("ik"); //6
            baffle(quince);  //7
            System.out.println("boo-wa-ha-ha");  //14
        }
    }
      
	}

/*
 * part 3:
 * zippo = "rattle"
 * 
 * part 4:
 *  ik
	rattle
	ping zoop
	boo-wa-ha-ha
 */
		 
		
		
	


