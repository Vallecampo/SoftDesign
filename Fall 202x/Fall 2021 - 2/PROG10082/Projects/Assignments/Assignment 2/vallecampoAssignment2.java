/*
 *Name:  David Vallecampo
 *Assignment:  vallecampoAssignment2
 *Program: Computer Programming - Prog10082
 *This program Calculates the Slope, and MidPoint, of the line PQ,
 *the coordinates of which, will be taken via user input
 */

import java.util.Scanner;

public class vallecampoAssignment2 {
	
	public static void main(String[] args){
		
		//opener for point P 
		System.out.println("-Recording Point P-");
		
		//prompt for x-value of point P
		Scanner xOneCoordinate = new Scanner(System.in);
		System.out.print("Enter X-Value: ");
		double xOneP = xOneCoordinate.nextDouble();
		
		//prompt for y-value of point P
		Scanner yOneCoordinate = new Scanner(System.in);
		System.out.print("Enter Y-Value: ");
		double yOneP = yOneCoordinate.nextDouble();
		
		//Now we start on point Q
		System.out.println("\n-Recording for Q-");
		
		//prompt for x-value of point Q
		Scanner xTwoCoordinate = new Scanner(System.in);
		System.out.print("Enter X-Value: ");
		double xTwoQ = xTwoCoordinate.nextDouble();
		
		//prompt for y-value of point Q
		Scanner yTwoCoordinate = new Scanner(System.in);
		System.out.print("Enter Y-Value: ");
		double yTwoQ = yTwoCoordinate.nextDouble();
		
		//formula to calculate the slope of the line
		double slopePQ = (yTwoQ - yOneP) / (xTwoQ - xOneP);
		
		//formula for X Coordinate of Mid-Point
		double midPointX = (xOneP + xTwoQ) / 2;
		
		//formula for Y Coordinate of Mid-Point
		double midPointY = (yOneP + yTwoQ) / 2;
        
		//displays info
		System.out.printf("\nA Line connected by P(%.1f, %.1f) and Q(%.1f, %.1f)",
			xOneP, yOneP, xTwoQ, yTwoQ);
		System.out.printf("\n- Has a slope of %.2f", slopePQ);
		System.out.printf("\n- Has a mid-point of (%.1f, %.1f)\n", 
			midPointX, midPointY);
			
		//Equation to calculate the distance between points P and Q
		double distancePQ = Math.sqrt((Math.pow((xTwoQ - xOneP), 2)) + 
			(Math.pow((yTwoQ - yOneP), 2)));
		
		//displays info
		System.out.printf("\nThe distance between P and Q is %.2f", distancePQ);
		
		//formula to solve for b in y = mx + b
		double b = yOneP - (slopePQ * xOneP);
		
		//if statement in order to change equation based on value of b
		if (b >= 0){
		
			System.out.printf("\nThe line's equation is y = %.2fx + %.2f", 
				slopePQ, b);
		}
		else{
		
			System.out.printf("\nThe line's equation is y = %.2fx - %.2f", 
				slopePQ, (b * -1));
		}
	}
}
