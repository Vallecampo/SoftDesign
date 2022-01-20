import java.util.Scanner;

public class Testing {
	
	public static final double TWO_HALF_PERCENT = 0.025;
	public static final double FIVE_PERCENT = 0.05;

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter your balance in $: ");
	double balance = input.nextDouble();
	
	double interest = 0;
	
	if (balance < 1000){
		double interest = 1 + TWO_HALF_PERCENT;
	} else if (balance >= 1000) {
		double interest = 1 + FIVE_PERCENT;
		}
	}
	
	double totalBalance = balance * interest;
	
	System.out.println("Your balance is " + totalBalance + ".");
}