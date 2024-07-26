package QAP4.Problem2;
import java.util.Scanner;

// CountLetters class to count occurrences of each letter in a word
public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26]; // Array to hold counts for each letter
        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
        } finally {
            if (scan != null) {
                scan.close();
            }
        }

        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // Convert the input word to uppercase for consistency
        word = word.toUpperCase();

        // Iterate over each character in the word
        for (int i = 0; i < word.length(); i++) {
            try {
                // Increment the count for the corresponding letter
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle case where character is not a letter
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        // Display the counts for each letter
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
