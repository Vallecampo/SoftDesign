import java.util.Scanner;

public class MethodsNTingz{
	
	public static void main(String[] args){
		
		holidayGreeting();
		
		java10();
		
		squareRoot();
	}
	
	public static void java10(){
		for (int i = 1; i <= 10; i++){
			System.out.println("Java");
		}
	}
	
	public static void squareRoot(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = in.nextInt();
		System.out.printf("Your number squared is: %.2f\n", Math.sqrt(number));
		in.close();
		in = null;	
	}
	
	public static void holidayGreeting(){
		System.out.println("Happy Holidays");
	}
	
}