/*
 * Name:  David Vallecampo
 * Assignment:  VallecadAssignment4
 * Program: Computer Programmer

 * Records the count of defective items in a workplace,
 * then summarizes the data and displays statistics about it
 */

import java.util.Scanner;

public class VallecadAssignment4 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String[] daysOfWeek = {"Monday", "Tuesday", 
			"Wednesday", "Thursday", "Friday", "Saturday"};
		int[] rejItems = new int[6];
		
		int itemCount;
		char another;
		
		for (int i = 0; i < daysOfWeek.length; i++){
			System.out.println(daysOfWeek[i]);
			
			do {
				System.out.print("Number of defective items: ");
				itemCount = input.nextInt();
				
				rejItems[i] += itemCount;
				
				System.out.print("Another? (Y/N): ");
				another = input.next().toUpperCase().charAt(0);
			} while (another == 'Y');
			
			System.out.println(daysOfWeek[i] + "'s total rejections: " 
						+ rejItems[i] + "\n");
		}
		double totalRej = rejItems[0];
		int highest = rejItems[0];
		int dayIndex = 0;
		
		for (int i = 0; i < daysOfWeek.length; i++){
			totalRej += rejItems[i];
			
			if (rejItems[i] > highest){
				highest = rejItems[i];
				dayIndex = i;
			}
		}
		double avgRej = totalRej / daysOfWeek.length;
		
		double sumSqDiff = 0;
		
		for (int i = 0; i < daysOfWeek.length; i++){
			sumSqDiff += Math.pow((rejItems[i] - avgRej),2);
		}
		double standDev = Math.sqrt(sumSqDiff / daysOfWeek.length);
		
		System.out.println("Day with highest # rejects: " 
			+ daysOfWeek[dayIndex]);
		System.out.printf("Average: %.1f\n", avgRej);
		System.out.printf("Deviation: %.2f\n", standDev);
	}//END MAIN()
	
}