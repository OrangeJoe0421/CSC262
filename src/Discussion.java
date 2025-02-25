import java.util.ArrayList;
import java.util.Arrays;

public class Discussion {
    public static void main(String[] args) {
        // Demonstrating Arrays
        System.out.println("=== Array Demonstration ===");

        // Declaring and initializing an array (fixed size)
        int[] numArray = {10, 20, 30, 40, 50};

        // Accessing elements using index
        System.out.println("Element at index 2: " + numArray[2]);

        // Modifying an element
        numArray[2] = 99;
        System.out.println("Modified element at index 2: " + numArray[2]);

        // Arrays have a fixed length
        System.out.println("Array length: " + numArray.length);

        // Arrays do not have built-in methods for easy manipulation
        System.out.println("Original array: " + Arrays.toString(numArray));

        // Arrays require manual resizing (not possible directly)
        // Uncommenting the following line will cause an error:
        // numArray[5] = 60; // ArrayIndexOutOfBoundsException

        System.out.println("\n=== ArrayList Demonstration ===");

        // Declaring an ArrayList (dynamic size)
        ArrayList<Integer> numList = new ArrayList<>();

        // Adding elements dynamically
        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);
        numList.add(50);

        // Accessing elements using get()
        System.out.println("Element at index 2: " + numList.get(2));

        // Modifying an element using set()
        numList.set(2, 99);
        System.out.println("Modified element at index 2: " + numList.get(2));

        // ArrayLists have dynamic sizing
        numList.add(60); // Can add more elements dynamically
        System.out.println("ArrayList after adding an element: " + numList);

        // Removing an element
        numList.remove(1);
        System.out.println("ArrayList after removing element at index 1: " + numList);

        // Finding size of ArrayList
        System.out.println("ArrayList size: " + numList.size());

        // ArrayLists provide built-in methods for manipulation
        System.out.println("Does ArrayList contain 40? " + numList.contains(40));
    }
}
