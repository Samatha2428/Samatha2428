import java.io.*;
import java.util.*;
public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;

        // Iterate through the array
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] != 0) {
                // Swap non-zero element with the element at lastNonZeroIndex
                int temp = nums[currentIndex];
                nums[currentIndex] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;

                // Move the lastNonZeroIndex to the next position
                lastNonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println("Output: " + java.util.Arrays.toString(nums1));

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println("Output: " + java.util.Arrays.toString(nums2));
    }
}
