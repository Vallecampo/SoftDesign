import java.util.Scanner;

public class BlindsEstimator{
	
	public static final double HST_TAX = 0.13;
	public static final double COST_PER_SQM = 2;
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
	
		System.out.print("Please enter the width of your blinds: ");
		double width = input.nextDouble();
		
		System.out.print("Please enter the length of your blinds: ");
		double length = input.nextDouble();
		
		double subTotal = (width * length) * COST_PER_SQM;
		
		double totalHST = subTotal * HST_TAX;
		
		double finalTotal = subTotal + totalHST;
		
		System.out.println("Cost of your vertical blinds: ");
		System.out.printf("%-12s $%7.2f\n", "Sub Total: ", subTotal);
		System.out.printf("%-12s $%7.2f\n", "HST: ", totalHST);
		System.out.printf("%-12s $%7.2f\n", "Final Total: ", finalTotal);
	}
}
