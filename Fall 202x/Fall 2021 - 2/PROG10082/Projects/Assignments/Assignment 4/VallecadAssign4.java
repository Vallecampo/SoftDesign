/*
 *Name:  David Vallecampo
 *Assignment:  VallecampoAssign4
 *Program: Computer Programming - Prog10082
 *This program records the number of rejected items
 *by the workers throughout the days and displays 
 *statistics about them afterwards
 */
import java.util.Scanner;

public class VallecadAssign4 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		char another = 'Y';
		int rejTotal = 0;
		
		String[] workDays= { "Sunday", "Monday", "Tuesday", 
			"Wednesday", "Thursday", "Friday"};
		int[] dayTotal = new int[6];
		
		for (int i = 0; i <= dayTotal.length; i++) {
			
			System.out.println(workDays[i]);
			
			while (another == 'Y'){
				
				System.out.print("Enter the number of rejected items: ");
				dayTotal[i] = input.nextInt();
					
				rejTotal += dayTotal[i];
					
				System.out.print("Another? (Y/N): ");
				another = input.next().toUpperCase().charAt(0);
				
				System.out.println(workDays[i] + "'s total: " + rejTotal + "\n");
			}
		}
		
		//double rejAvg = rejItems / dayTotal[i];
		//System.out.printf("Average: %.2f", rejAvg);
		/*then what?
		Calculate the day number with the highest number of defective items.
		Calculate the average total for all 6 days.
		Calculate the standard deviation across all 6 days.
		*/
		
	}
	
}