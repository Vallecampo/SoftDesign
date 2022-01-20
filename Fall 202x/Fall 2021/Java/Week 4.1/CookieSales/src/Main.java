import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputFlavor = new Scanner(System.in);
        System.out.print("Please enter the flavor of the cookie: " );

        String strFlavor = inputFlavor.nextLine();
        System.out.println("Your flavor is : " + strFlavor);

        Scanner sales1 = new Scanner(System.in);
        System.out.print("Please enter the sales for Friday: ");
        double friSales = sales1.nextDouble();

        Scanner sales2 = new Scanner(System.in);
        System.out.print("Please enter the sales for Saturday: ");
        double satSales = sales2.nextDouble();

        Scanner sales3 = new Scanner(System.in);
        System.out.print("Please enter the sales for Sunday: ");
        double sunSales = sales3.nextDouble();

        double average = (friSales + satSales + sunSales) / 3;

        System.out.println("Your weekend average is " + average);
    }
}
