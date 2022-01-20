import java.util.Scanner;

public class SalesJunk
{
     public static void main(String[] args)
     {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the amount sales in $: ");
		double totalSales = input.nextDouble();
		
		double comRate = 0;
		
		if (totalSales < 1000){
			comRate = 0.05;
		} else if (totalSales < 2000){
			comRate = 0.075;
		} else if (totalSales < 3500){
			comRate = 0.10;
		} else {
			comRate = 0.15;
		}
		
		double totalPayout = totalSales * comRate;
		
		System.out.printf("Sales Amount: $%.2f\nCommision rate: %.2f\n" +
			"Payout: $%.2f", totalSales, comRate, totalPayout);
     }
}