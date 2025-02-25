/*import java.util.Scanner;
import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Read the input word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        char[] chars = word.toCharArray(); // Convert string to character array

        // Perform random swaps word.length() times
        for (int k = 0; k < chars.length; k++) {
            int i = random.nextInt(chars.length - 1); // Random index excluding the last position
            int j = i + 1 + random.nextInt(chars.length - i - 1); // Random index greater than i

            // Swap characters at positions i and j
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        // Print the permuted word
        System.out.println("Permuted word: " + new String(chars));

        scanner.close();
    }
}
*/