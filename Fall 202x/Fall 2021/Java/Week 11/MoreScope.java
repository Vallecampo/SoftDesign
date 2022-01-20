public class MoreScope {
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        int increment = 2;
 
        System.out.print("Please enter a whole number: ");
        int num = in.nextInt();
 
        addValue();
    }
 
    public static void addValue() {
        System.out.printf("Your value plus 2: %d\n", (num + increment));
    }
}