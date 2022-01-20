import java.util.Scanner;

public class LoopTingz{
	
	public static void main(String[] args){
		
		double grade = 0;
		int gradeCount = 0;
		double total = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a grade between 0 - 100: ");
		grade = input.nextDouble();
		
		while (grade >= 0 && grade <= 100){
			
			total += grade;
			System.out.print("Please enter another grade between 0 - 100: ");
			grade = input.nextDouble();
			gradeCount++;
			
			if (grade < 0){
				System.out.println("You have exited.");
				break;
			}
		}
		double totalGrade = total / gradeCount;
		System.out.println("Your average grade is: " + totalGrade);
	}
}