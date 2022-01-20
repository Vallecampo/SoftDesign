import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please guess a number between 1 and 5: ");
        int userGuess = input.nextInt();

        int randomNum = (int)(Math.random() * 5) + 1;

        String output = (userGuess == randomNum) ? "You are correct!" : "You " +
                "have guessed incorrectly!";

        System.out.println(output);


    }
}
