/*public class Problem3 {
    public static void main(String[] args) {
        int size = 10; // Define the size of the multiplication table

        // Print the header row
        System.out.print("    "); // Padding for alignment
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n" + "    " + "-".repeat(size * 4));

        // Print the multiplication table
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i); // Row label
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j); // Print each product
            }
            System.out.println();
        }
    }
}
*/