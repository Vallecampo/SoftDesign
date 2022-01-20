import java.util.Scanner;

public class Week9 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		
		char keepGoing = '\0';
		double highestAvg = 0;
		String highestStudent = "";
		do {
			double totalGrade = 0;
			System.out.print("Enter Student name: ");
			String name = in.next();
			
			for (int i = 1; i <= 3; i++){
				System.out.printf("Test #%d Grade: ", i);
				double grade =	in.nextDouble();
				totalGrade += grade;
			}
			double avgGrade = totalGrade / 3;
			System.out.printf("Average: %.1f\n", avgGrade);
			
			if (avgGrade > highestAvg) {
				highestAvg = avgGrade;
				highestStudent = name;
			}
			
			System.out.print("Another (Y/N)? ");
			keepGoing = in.next().toUpperCase().charAt(0);
		} while (keepGoing == 'Y');
		System.out.println("Student with the highest average is: " 
			+ highestStudent);
	}
}