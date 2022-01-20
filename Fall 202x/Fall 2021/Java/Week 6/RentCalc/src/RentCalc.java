import java.util.Scanner;

public class RentCalc {

    public static final double ONE_BEDROOM = 600.0;
    public static final double TWO_BEDROOM = 1000.0;
    public static final double THREE_BEDROOM = 1600.0;
    public static final double BASE_COST = 1000.0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of bedrooms in the " +
                "apartment: ");
        int numRooms = input.nextInt();

        double roomCost = 0;

        if (numRooms == 1) {
            roomCost = ONE_BEDROOM;
        } else if (numRooms == 2){
            roomCost = TWO_BEDROOM;
        } else if (numRooms == 3) {
            roomCost = THREE_BEDROOM;
        }

        double totalRent = BASE_COST + roomCost;

        System.out.printf("Your rent is $%.1f\n", totalRent);

    }
}
