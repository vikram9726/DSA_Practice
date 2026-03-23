package Practice_Extra;

import java.util.Arrays;

/**
 * Problem: Can Make Arithmetic Progression From Sequence
 * ------------------------------------------------------
 * Given an array of numbers arr, return true if the array can be rearranged
 * to form an arithmetic progression. Otherwise, return false.
 *
 * An arithmetic progression is a sequence where the difference between
 * consecutive elements is constant.
 *
 * ------------------------------------------------------
 * Example 1:
 * Input: arr = [3, 5, 1]
 * Output: true
 * Explanation: After sorting -> [1, 3, 5]
 * Differences: (3-1 = 2), (5-3 = 2) → valid AP
 *
 * Example 2:
 * Input: arr = [1, 2, 4]
 * Output: false
 * Explanation: Differences: (2-1 = 1), (4-2 = 2) → not equal
 *
 * ------------------------------------------------------
 * Approach:
 * 1. Sort the array.
 * 2. Find the common difference between first two elements.
 * 3. Check if all consecutive differences are equal.
 *
 * Time Complexity: O(n log n) due to sorting
 * Space Complexity: O(1)
 */

public class ArithmeticProgressionChecker {

    // Function to check arithmetic progression
    public static boolean canMakeArithmeticProgression(int[] arr) {

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Find initial difference
        int diff = arr[1] - arr[0];

        // Step 3: Check all consecutive differences
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return false;
            }
        }

        return true;
    }

    // Main method for testing
    public static void main(String[] args) {

        // Example 1
        int[] arr1 = {3, 5, 1};
        System.out.println("Example 1 Output: " + canMakeArithmeticProgression(arr1));

        // Example 2
        int[] arr2 = {1, 2, 4};
        System.out.println("Example 2 Output: " + canMakeArithmeticProgression(arr2));

        // Custom test
        int[] arr3 = {7, 3, 5, 1};
        System.out.println("Custom Test Output: " + canMakeArithmeticProgression(arr3));
    }
}
