import java.util.Scanner;

public class ArrayDemo{
	
	public static void main(String[] args){
		
		double[] grades = new double [6];
		Scanner input = new Scanner(System.in);
		int count = 1;
		
		for (int i = 0; i < grades.length; i++){
			
			System.out.printf("Enter grade number %d: ", count);
			count++;
			grades[i] = input.nextDouble();
		}
		
		int counter = 1;
		for (double gr : grades) {
			System.out.printf("%d: %.1f\n", counter++, gr);
		}
		
	}
}