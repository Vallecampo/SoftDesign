/*
 *Name:  David Vallecampo
 *Assignment:  vallecampoAssignment1
 *Program: Computer Programming - Prog10082
 *This program outlines my life story, with its many tribulations, and, triumphs
 */

//This imports the scanner package
import java.util.Scanner;

public class vallecampoAssignment1 {

    public static void main(String[] args){
		
		//This creates the object for the input
        Scanner input = new Scanner(System.in);
		
		//Prompt user for name
        System.out.print("Hello! Please enter your name: ");
		
		//takes input from keyboard
        String yourName = input.nextLine();
		
		//prints greeting, along with value entered
        System.out.println("\nNice to meet you, " + yourName + "!\n");
		
		//creating string variables for the array + assignment content
        String openerLine = "Please, allow me to introduce myself.\n";
        String filaName = "Name: David Vallecampo (he/him)";
        String expProg = "Programming Experience: Elementary Java";
        String favSubject = "Favourite Subject: Literature";
        String leastSubject = "Least Favourite Subject: Biology";
        String myInterests = "Interests: Reading, fitness, cooking";
        String aboutMe = "You can ask me questions in class if it's too quiet" +
			". That will at least shame me into studying if I get it wrong " +
			"in the moment.";
		
		
		//creating array to store previously created strings
        String[] myInfo = { openerLine, filaName, expProg, favSubject, 
			leastSubject, myInterests, aboutMe};
			
			//for loop set up in order to print out strings
			for (String i : myInfo) {
			System.out.println(i);
		}
    }
}