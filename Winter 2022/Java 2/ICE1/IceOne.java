import java.util.Scanner;

public class IceOne{

    public static void main(String[] args) {

        double customerBalance, customerCreditLimit, customerTotalCharges, customerTotalCredits,
            updatedBalance;
        long customerAccount;
        String customerName;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Customer Name: ");
        customerName = input.nextLine();

        System.out.print("Enter Account Number: ");
        customerAccount = input.nextLong();

        System.out.printf("\nName: %s\nAccount#: %d\n\n", customerName, customerAccount);

        System.out.print("Enter initial month's Balance: ");
        customerBalance = input.nextDouble();

        System.out.print("Enter Total Charges for the month: ");
        customerTotalCharges = input.nextDouble();

        System.out.print("Enter Total Credit Applied for the month: ");
        customerTotalCredits = input.nextDouble();

        System.out.print("Enter Allowed Credit Limit: ");
        customerCreditLimit = input.nextDouble();

        input.close();

        updatedBalance = calBalance(customerBalance, customerTotalCharges, customerTotalCredits);

        if (updatedBalance > customerCreditLimit){
            System.out.println("\nCredit limit exceeded");
        } else {
            System.out.printf("\nNew Balance: %.2f\n", updatedBalance);
        }
    }
    static double calBalance(Double customerBalance, Double customerTotalCharges,
                           Double customerTotalCredits) {
        double newBalance = customerBalance + customerTotalCharges - customerTotalCredits;
        return newBalance;
    }
}