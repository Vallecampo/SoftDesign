import java.util.Scanner; //Import the scanner class

public class test {
	
	public static void main(String[] args) {

		//This creates a scanner object
		Scanner myLifeSavings = new Scanner(System.in);
		//User inputs life savings
		System.out.println("Please enter you life savings, in dollars: ");
		
		double num = myLifeSavings.nextDouble();
		
		myLifeSavings.close();
		
		double q = num / 0.25;
		
		System.out.println("You have exactly " + q + " quarters.");

	}
}