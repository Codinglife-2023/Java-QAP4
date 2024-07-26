package QAP4.Problem3;
import java.util.Scanner;

// CountLetters class to count occurrences of each letter in a word
public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26]; // Array to hold counts for each letter
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();


        // Convert the input word to uppercase for consistency
        word = word.toUpperCase();

        // Iterate over each character in the word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Increment the count for the corresponding letter
                counts[ch - 'A']++;
            } else {
                // Handle case where character is not a letter
                System.out.println("Not a letter: " + ch);
            }
        }

        // Display the counts for each letter
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
                scan.close();


            }

        }
    }
}
