import java.util.Scanner;

public class CharStuff{
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence\n");
		String entered = input.next();
		
		int numChars = 0, numUpper = 0, numLower = 0;
		int numDigits = 0;
		
		for (int i = 0; i < entered.length(); i++){
			
			char c = entered.charAt(i);
			
			if (Character.isDigit(c)){
				numDigits++;
			} else if (Character.isLetter(c)){
				numChars++;
				if (Character.isUpperCase(c)){
					numUpper++;
				} else {
					numLower++;
				}
			}
		}
		System.out.println(numDigits + "\n" + numChars + "\n" +
			numUpper + "\n" + numLower + "\n");
	}
}