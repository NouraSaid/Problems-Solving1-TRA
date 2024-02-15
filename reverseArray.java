public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        
        // Calling the reverseArray method and storing the returned array in reversedArray
        int[] reversedArray = reverseArray(originalArray);

        // Printing the original and reversed arrays
        System.out.println("Original Array: ");
        printArray(originalArray);

        System.out.println("\nReversed Array: ");
        printArray(reversedArray);
    }

    // Definition of the reverseArray method
    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversed = new int[length];

        // Filling the reversed array in reverse order
        for (int i = 0; i < length; i++) {
            reversed[i] = arr[length - 1 - i];
        }

        return reversed;
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}