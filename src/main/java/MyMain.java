import java.util.Scanner;
import java.lang.Math;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(final int a, final int b, final int c) {
        // checks for b: if && = both need to be true, || = only one needs to be true
        if ((a < b && b < c) || (c < b && b < a))
            return b;

        // checks for a using same logic
        else if ((b < a && a < c) || (c < a && a < b))
            return a;
        // simple else statement
        else
            return c;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(final int a, final int b) {
        if (Math.abs(a) > Math.abs(b))
            return a;

        else
            return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(final int a, final int b) {
        final double c = Math.sqrt((a * a) + (b * b));
        return c;
    }

    public static void main(final String[] args) {
        // You may want to keep these lines of code to test that your methods work
        //System.out.println(median(1, 2, 3)); // should be 2
        //System.out.println(magnitude(-7, -1)); // should be -7
        //System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to find median (type 1) magnitude (type 2) or pythagoras (type 3)" );

        String input1 = scan.nextLine();  // Read user input

        if (input1.equals("1")) {
            System.out.println("Please input three variables." );
            String inputa = scan.nextLine();
            int a = Integer.parseInt(inputa);
            String inputb = scan.nextLine();
            int b = Integer.parseInt(inputb);
            String inputc = scan.nextLine();
            int c = Integer.parseInt(inputc);
            System.out.println("The median is " + median(a, b, c));
        }
        else if (input1.equals("2")) {
            System.out.println("Please input two variables." );
            String inputa2 = scan.nextLine();
            int a = Integer.parseInt(inputa2);
            String inputb2 = scan.nextLine();
            int b = Integer.parseInt(inputb2);
            System.out.println("The magnitude is " + magnitude(a, b));
        }
        else
            System.out.println("Please input two variables." );
            String inputa3 = scan.nextLine();
            int a = Integer.parseInt(inputa3);
            String inputb3 = scan.nextLine();
            int b = Integer.parseInt(inputb3);
            System.out.println("C is equal to " + pythagoras(a, b));
    }
}
