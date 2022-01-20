import java.util.Scanner;

public class SwitchTingz {
	
     public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a day: ");
		String term = input.next();
			
			switch (term.toLowerCase()) {
            case "monday":
                System.out.println("Lasagna");
				break;
            case "tuesday":
			case "saturday":
                System.out.println("Pizza");
				break;
            case "wednesday":
                System.out.println("Hot Wings");
				break;
            case "thursday":
			case "Sunday":
                System.out.println("Roast Chicken");
				break;
			case "friday":
                System.out.println("Fish and Chips");
				break;
        }
	}
}