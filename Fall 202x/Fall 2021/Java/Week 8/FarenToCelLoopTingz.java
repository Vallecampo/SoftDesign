import java.util.Scanner;

public class FarenToCelLoopTingz{
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a starting temperature: ");
		int start = input.nextInt();
		System.out.print("Enter an ending temperature: ");
		int end = input.nextInt();
		
		for (int i = start; i <= end; i++){
			
			double celsius = (5.0/9.0) * (i - 32);
			System.out.printf("%4d %5.1f\n", i, celsius);
		}
	
	}
}