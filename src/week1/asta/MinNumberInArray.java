package week1.asta;

public class MinNumberInArray {

    /**
     * // Write a method that can find the minimum number from an int Array
     * //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */

    public static int minNumber(int[] nums){

        int min = nums[0];

        for (int each : nums) {
            if (each < min)
                min = each;
        }

        return min;
    }

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int[] arr2 = {9129, 1412, 23, 32, 44, -57, 116};
        System.out.println(minNumber(arr));
        System.out.println(minNumber(arr2));
    }
}
