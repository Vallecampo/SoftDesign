package javaapplication2;
import java.util.Scanner;

/**
 * Class Name + **Class description** 
 *
 * @author Vallecad
 */
public class JavaApplication2 {

    public static void main(String[] args) {
        
        String name;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        name = input.nextLine();
        
        char[] revName = name.toCharArray();
        
        for(int i = revName.length - 1; i >= 0; i--){
            System.out.println(revName[i]); 
        }
    }
}
