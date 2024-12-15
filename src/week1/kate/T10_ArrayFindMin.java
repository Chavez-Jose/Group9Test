package week1.kate;

public class T10_ArrayFindMin {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static int findMin(int[] arr) {
        // edge case handling to avoid potential runtime errors
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
        // The method initializes the minimum value with the first element and iterates through the array,
        // updating min whenever it finds a smaller value. This ensures the smallest value is found.
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("Minimum number in the array: " + findMin(arr));
    }
}
