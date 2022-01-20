import java.util.Scanner;
 
public class Week6 {
 
    public static void main(String[] args) {
 
        Scanner keysIn = new Scanner(System.in);
        System.out.print("Enter the final grade: ");
        double grade = keysIn.nextDouble();
        String letter = "";
 
        if (grade < 50) {
            letter = "F";
        } else if (grade < 60) {
            letter = "D";
        } else if (grade < 65) {
            letter = "C";
        } else if (grade < 70) {
            letter = "C+";
        } else if (grade < 75) {
            letter = "B";
        } else if (grade < 80) {
            letter = "B+";
        } else if (grade < 90) {
            letter = "A";
        } else {
            letter = "A+";
        }
 
        System.out.println("Letter grade: " + letter);
    }
}