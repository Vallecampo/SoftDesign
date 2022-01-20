import java.util.Scanner;

public class DiscountTest {
	
	public static final double DISCOUNT = .05;
	public static final double EXTRA_DISCOUNT = .15;
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the bill amount: ");		
		double amountBill = input.nextDouble();
		
		double discount = (amountBill > 100) ? EXTRA_DISCOUNT : DISCOUNT;
		amountBill *= (1- discount);
		
		System.out.printf("Amount owed: $%.2f", amountBill);
		
		
	}
}