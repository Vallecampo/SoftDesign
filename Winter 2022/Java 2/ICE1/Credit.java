import java.util.Scanner;

public class Credit
{
// calculates the balance on several credit accounts
public static void main( String[] args )
{
Scanner input = new Scanner( System.in );

int account; // account number
double oldBalance; // starting balance
double charges; // total charges
double credits; // total credits
double creditLimit; // allowed credit limit
double newBalance; // new balance

System.out.print( "Enter Account Number (or -1 to quit): " );
account = input.nextInt(); // read in account number

// exit if the input is -1; otherwise, proceed with the program
while ( account != -1)
{
System.out.print( "Enter Balance: " );
oldBalance = input.nextDouble(); // read in original balance

System.out.print( "Enter Charges: " );
charges = input.nextDouble(); // read in charges

System.out.print( "Enter Credits: " );
credits = input.nextDouble(); // read in credits

System.out.print( "Enter Credit Limit: " );
creditLimit = input.nextDouble(); // read in credit limit

// calculate and display new balance
newBalance = oldBalance + charges - credits;
System.out.printf( "New balance is $%.2f\n", newBalance );

// display a warning if the user has exceed the credit limit
if ( newBalance > creditLimit )
System.out.println( "Credit limit exceeded" );

System.out.print( "\nEnter Account Number (or -1 to quit): " );
account = input.nextInt(); // read in next account number
} // end while
} // end main
} // end class Credit