package QAP4.Problem4;
import java.util.Scanner;

// ParseInts class to sum integers in a line of text
public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        Scanner scanLine = new Scanner(scan.nextLine());

        // Iterate over each token in the input line
        while (scanLine.hasNext()) {
            try {
                // Try to parse each token as an integer
                val = Integer.parseInt(scanLine.next());
                sum += val; // Add the integer to the sum
            } catch (NumberFormatException e) {
                // Ignore non-integer inputs
            }
        }
        // Display the sum of the integers
        System.out.println("The sum of the integers on this line is " + sum);
    }
}
