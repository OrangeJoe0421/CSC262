/*import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for an integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the methods and display the results
        System.out.println("First digit: " + firstDigit(number));
        System.out.println("Last digit: " + lastDigit(number));
        System.out.println("Number of digits: " + countDigits(number));

        scanner.close();
    }

    // Method to get the first digit of a number
    public static int firstDigit(int n) {
        n = Math.abs(n); // Handle negative numbers
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    // Method to get the last digit of a number
    public static int lastDigit(int n) {
        return Math.abs(n) % 10; // Handle negative numbers
    }

    // Method to count the number of digits in a number
    public static int countDigits(int n) {
        n = Math.abs(n); // Handle negative numbers
        return String.valueOf(n).length();
    }
}
*/