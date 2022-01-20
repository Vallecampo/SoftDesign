import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //User input object invocation
        Scanner input = new Scanner(System.in);
        //Defining messages as strings
        String opener = "Guess a number between 1 and 100: ";
        String closer = "Thanks for playing!";
        String guessAgain = "Guess: ";
        String lowMessage = "too low!: ";
        String highMessage = "too high!: ";
        String winMessage = "correct!";
        String quitMessage = "Quitter! Your number was ";
        String restartPrompt = "Would you like to try again?(Y/N): ";
        String invalidPrompt = "Number cannot be greater than 100.";
        //initializing variables to use for game, user guesses, and the random number to guess
        char newGame;
        int userGuess, randomNum;
        //do while loop, so we can start/restart the game - generate random number to guess
        do {
            System.out.print(opener);
            randomNum = (int)(Math.random() * 100) + 1;
            userGuess = 0;
            //while loop will check the guess against the number and determine what to do accordingly
            while (userGuess != randomNum){
                userGuess = input.nextInt();
                if (userGuess < 0) { //will quit game on negative number input
                    System.out.printf("%s%d\n", quitMessage, randomNum);
                    System.out.println(closer);
                    break;
                } else if (userGuess == randomNum) { //wins game and asks to play again if guess is correct
                    System.out.println(winMessage);
                } else if (userGuess > 100)
                    System.out.println(invalidPrompt); //quick invalid loop for numbers over 100
                String loopOutput = (userGuess > randomNum) ? highMessage ://assigns higher/lower and prompt guess again
                        lowMessage;
                System.out.printf("%s\n%s", loopOutput, guessAgain);
            }
            //Asks to play again, prompt for y/n, will only take 'y', and anything else is considered 'n' to exit game
            System.out.print(restartPrompt);
            newGame = input.next().charAt(0);
        } while (newGame == 'y' || newGame == 'Y');
    }
}