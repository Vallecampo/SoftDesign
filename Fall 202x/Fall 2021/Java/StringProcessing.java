import java.util.Scanner;

public class StringProcessing{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the hour following format (hh:mm:ss): ");
		String time = input.next();
		
		int colon1 = time.indexOf(":");
		int colon2 = time.lastIndexOf(":");
		
		String hour = time.substring(0, colon1);
		String minute = time.substring(colon1 + 1,colon2);
		String seconds = time.substring(colon2 + 1);
		
		System.out.println(hour + "\n" + minute + "\n" + seconds);
		
	}
}