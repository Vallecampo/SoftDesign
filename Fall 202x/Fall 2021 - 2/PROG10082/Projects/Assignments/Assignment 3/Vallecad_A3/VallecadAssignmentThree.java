/*
 *Name:  David Vallecampo
 *Assignment:  VallecampoAssignment3
 *Program: Computer Programming - Prog10082
 *This program is a guessing game which generates a 
 *random number and asks the user to guess it, while 
 *giving small hints along the way
 */


import java.util.Scanner;

public class VallecadAssignmentThree {

    public static void main(String[] args) {

        //introduces scanner object for getting user guesses
        Scanner input = new Scanner(System.in);

        //Defining preset string variables for communication
        String opener = "Guess a number between 1 and 100: ";
        String closer = "Thanks for playing!";
        String lowMessage = "Too low!";
        String highMessage = "Too high!";
        String winGame = "Correct!";
        String quitMessage = "Quitter! Your number was ";
        String restartPrompt = "Would you like to try again?(Y/N): ";
        String guessAgain = "Guess: ";

        //Initializing variables outside the scope of the loop
        char newGame;
        int userGuess, randomNum;

        //Start of the do while loop to restart the game
        do {
            //printing opening line and defining the variables
            System.out.print(opener);
            randomNum = (int)(Math.random() * 100) + 1;
            userGuess = 0;

            //start of the looped if statements to play the game
            while (userGuess != randomNum){
                userGuess = input.nextInt();

                //Initial if statement to provide option to quit with negative#
                if (userGuess < 0) {
                    System.out.printf("%s%d\n", quitMessage, randomNum);
                    break;
                //if statement to win game if they guess correctly
                } else if (userGuess == randomNum) {
                    System.out.println(winGame);
                    break;
                //This is feedback loop to provide hints for guesses
                } else if (userGuess > 100)
                    System.out.println("Invalid");
                String loopOutput = (userGuess > randomNum) ? highMessage :
                        lowMessage;
                System.out.printf("%s\n%s", loopOutput, guessAgain);
            }

            //Prints message for restarting game or option to quit
            System.out.print(restartPrompt);
            newGame = input.next().toUpperCase().charAt(0);

        //Restarts loop if user inputs first character 'y', otherwise user quits
        } while (newGame == 'Y');
        System.out.println(closer);
    }
}