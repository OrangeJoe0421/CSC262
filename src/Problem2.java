/*import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int count = 0;
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        System.out.println("Enter positive floating-point numbers (enter a negative number to stop):");

        while (true) {
            // Prompt for input
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();

            // Check for sentinel value (negative number)
            if (num < 0) {
                break;
            }

            // Update statistics
            count++;
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Display results if at least one number was entered
        if (count > 0) {
            double average = sum / count;
            double range = max - min;

            System.out.println("\nStatistics:");
            System.out.println("Count of values entered: " + count);
            System.out.printf("Average of values: %.2f%n", average);
            System.out.printf("Smallest value: %.2f%n", min);
            System.out.printf("Largest value: %.2f%n", max);
            System.out.printf("Range: %.2f%n", range);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close();
    }
}
*/