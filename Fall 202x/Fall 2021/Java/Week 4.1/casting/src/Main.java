public class Main {

    public static void main(String[] args) {

        int num1 = 5;
        double num2 = 8.2;
        char letter = 'A';
        int ascE = 69;

        int num3 = (int)num2;       // force the double to be an int
        double num4 = num1;     // statement 2
        int anA = letter;       // statement 3
        char anE = (char)ascE;      // force the int to be a char

        System.out.println("num3: " + num3);
        System.out.println("num4: " + num4);
        System.out.println("anA: " + anA);
        System.out.println("anE: " + anE);

        double large = 1000000000000.0;
        long fits = (long)large;
        System.out.println(fits);

    }
}
