import java.util.Scanner;

public class Main {

    public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            String[] daysOfWeek = {"Monday", "Tuesday",
                    "Wednesday", "Thursday", "Friday", "Saturday"};
            int[] rejItems = new int[6];

            int count;
            char another;

            for (int i = 0; i < daysOfWeek.length; i++){
                System.out.println(daysOfWeek[i]);

                do {
                    System.out.print("Enter the number of defective items: ");
                    count = input.nextInt();

                    rejItems[i] += count;

                    System.out.print("Another? (Y/N): ");
                    another = input.next().toUpperCase().charAt(0);
                } while (another == 'Y');

                System.out.println(daysOfWeek[i] + "'s total rejections: "
                        + rejItems[i] + "\n");
            }
            double totalRej = rejItems[0];
            int highest = rejItems[0];
            int index = 0;
            for (int i = 1; i < daysOfWeek.length; i++){
                totalRej += rejItems[i];

                if (rejItems[i] > highest){
                    highest = rejItems[i];
                    index = i;
                }
            }

            double avgRej = totalRej / daysOfWeek.length;
            System.out.printf("Average: %.1f\n", avgRej);
            System.out.println("Day with highest # rejects: " + daysOfWeek[index]);
		/*
		Calculate the day number with the highest number of defective items.
		Calculate the average total for all 6 days.
		Calculate the standard deviation across all 6 days.
		*/
        }



    }
